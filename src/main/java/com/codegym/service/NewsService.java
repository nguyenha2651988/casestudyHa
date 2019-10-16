package com.codegym.service;

import com.codegym.model.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface NewsService {
    Page<News> findAll(Pageable pageable);

    Optional<News> findByID(Long id);

    void save(News news);

    void deleteById(Long id);

}
