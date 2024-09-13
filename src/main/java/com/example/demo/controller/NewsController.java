package com.example.demo.controller;

import com.example.demo.dto.NewsDto;
import com.example.demo.service.impl.NewsServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/NewsAgency")
public class NewsController {
    private final NewsServiceImpl newsService;

    public NewsController(NewsServiceImpl newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/news")
    public List<NewsDto> getNews(){
        return newsService.getNews();
    }

    @GetMapping("/news/popular")
    public List<NewsDto> getPopularNews(){
        return newsService.getPopularNews();
    }

    @GetMapping("/search/{search}")
    public List<NewsDto> findNewsByTitleOrSubject(@PathVariable String search){
        return newsService.findByTitleOrSubject(search.toLowerCase());
    }
}
