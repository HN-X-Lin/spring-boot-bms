package com.neo.service.search.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neo.Utils.EsConfig;
import com.neo.dao.SearchDao;
import com.neo.model.SearchDomain;
import com.neo.service.search.SearchService;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.text.Text;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service(value = "searchService")
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SearchDao searchDao;
    @Autowired
    private EsConfig esConfig;
    @Override
    public Page<SearchDomain> findAll(Pageable pageable){
        return searchDao.findAll(pageable);
    }
    @Override
    public void save(SearchDomain searchDomain){
        searchDao.save(searchDomain);
    }
    @Override
    public void delete(int bookId){
        searchDao.deleteById(bookId);
    }
    @Override
    public PageInfo<SearchDomain> search(int pageNum, int pageSize,String key){
        System.out.println(pageNum+" "+pageSize+" "+key);
        PageHelper.startPage(pageNum, pageSize);
        Client client = esConfig.esTemplate();
        BoolQueryBuilder boolQueryBuilder= QueryBuilders.boolQuery();
        boolQueryBuilder.filter(QueryBuilders.multiMatchQuery(key,"bookName","author","press","bookType"));
        HighlightBuilder highlightBuilder=new HighlightBuilder();
        highlightBuilder.preTags("<span style='color:red'>");
        highlightBuilder.postTags("</span>");
        highlightBuilder.field("bookName");
        highlightBuilder.field("author");
        highlightBuilder.field("press");
        //搜索数据
        SearchResponse response = client.prepareSearch("mytest")
                .setQuery(boolQueryBuilder)
                .highlighter(highlightBuilder).setSize(10000)
                .execute().actionGet();
        SearchHits searchHits = response.getHits();
        System.out.println(searchHits.getTotalHits());
        List<SearchDomain> list = new ArrayList<>();
        int ans=0;
        for(SearchHit hit : searchHits) {
            ans++;
            if(ans<=(pageNum-1)*pageSize) continue;
            if(ans>pageNum*pageSize) break;
            boolean flag1=true,flag2=true,flag3=true;
            SearchDomain entity = new SearchDomain();
            Map<String, Object> entityMap = hit.getSourceAsMap();
            //高亮字段
            if(!StringUtils.isEmpty(hit.getHighlightFields().get("bookName"))) {
                Text[] text = hit.getHighlightFields().get("bookName").getFragments();
                entity.setBookName(text[0].toString());
                flag1=false;
            }
            if(!StringUtils.isEmpty(hit.getHighlightFields().get("author"))) {
                Text[] text = hit.getHighlightFields().get("author").getFragments();
                entity.setAuthor(text[0].toString());
                flag2=false;
            }
            if(!StringUtils.isEmpty(hit.getHighlightFields().get("press"))) {
                Text[] text = hit.getHighlightFields().get("press").getFragments();
                entity.setPress(text[0].toString());
                flag3=false;
            }

            //map to object
            if(!CollectionUtils.isEmpty(entityMap)) {
                if(!StringUtils.isEmpty(entityMap.get("bookId"))) {
                    entity.setBookId(Integer.valueOf(String.valueOf(entityMap.get("bookId"))));
                }
                if(!StringUtils.isEmpty(entityMap.get("bookDate"))) {
                    entity.setBookDate(String.valueOf(entityMap.get("bookDate")));
                }
                if (flag1){
                    entity.setBookName(String.valueOf(entityMap.get("bookName")));
                }
                if (flag2){
                    entity.setAuthor(String.valueOf(entityMap.get("author")));
                }
                if (flag3){
                    entity.setPress(String.valueOf(entityMap.get("press")));
                }
                if(!StringUtils.isEmpty(entityMap.get("bookDesc"))) {
                    entity.setBookDesc(String.valueOf(entityMap.get("bookDesc")));
                }
                if(!StringUtils.isEmpty(entityMap.get("bookType"))) {
                    entity.setBookType(String.valueOf(entityMap.get("bookType")));
                }
                if(!StringUtils.isEmpty(entityMap.get("photo"))) {
                    entity.setPhoto(String.valueOf(entityMap.get("photo")));
                }
                if(!StringUtils.isEmpty(entityMap.get("cnt"))) {
                    entity.setCnt(Integer.valueOf(String.valueOf(entityMap.get("cnt"))));
                }
            }
            list.add(entity);
        }
        PageInfo result = new PageInfo(list);
        return result;
    }
    @Override
    public Optional<SearchDomain> findById(int bookId){
        return searchDao.findById(bookId);
    }
}
