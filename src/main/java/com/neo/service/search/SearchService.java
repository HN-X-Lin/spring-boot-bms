package com.neo.service.search;

import com.github.pagehelper.PageInfo;
import com.neo.model.SearchDomain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface SearchService {
    Page<SearchDomain> findAll(Pageable pageable);
    void save(SearchDomain searchDomain);
    void delete(int bookId);
    Optional<SearchDomain> findById(int bookId);
    PageInfo<SearchDomain> search(int pageNum, int pageSize, String key);
}
