package com.example.demo.service.spec;

import com.example.demo.dto.NewsDto;
import com.example.demo.entity.News;

import java.util.List;

public interface NewsService {
    List<NewsDto> getPopularNews();
    List<NewsDto> findByTitleOrSubject(String search);
    List<NewsDto> getNews();
}
