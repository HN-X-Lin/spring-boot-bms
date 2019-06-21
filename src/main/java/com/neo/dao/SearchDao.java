package com.neo.dao;

import com.neo.model.SearchDomain;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SearchDao extends ElasticsearchRepository<SearchDomain,Integer> {
}
