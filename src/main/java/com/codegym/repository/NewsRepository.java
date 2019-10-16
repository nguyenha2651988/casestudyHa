package com.codegym.repository;

import com.codegym.model.News;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NewsRepository extends PagingAndSortingRepository<News,Long> {
}
