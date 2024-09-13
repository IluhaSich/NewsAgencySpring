package com.example.demo.service.impl;

import com.example.demo.dto.NewsDto;
import com.example.demo.entity.News;
import com.example.demo.repository.NewsRepository;
import com.example.demo.service.spec.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NewsServiceImpl implements NewsService {
    private final NewsRepository newsRepository;

    @Autowired
    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<NewsDto> getNews(){
        return newsRepository.findByEditorIdNotNull().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());

        }

    @Override
    public List<NewsDto> findByTitleOrSubject(String search){
        return newsRepository.findByTitleOrSubject(search).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    };


    @Override
    public List<NewsDto> getPopularNews() {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime daysAgo = now.minusDays(3);
        Pageable pageable = PageRequest.of(0, 5);
        return newsRepository.findMostPopularNews(daysAgo, now, pageable).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public NewsDto convertToDto(News news) {
        NewsDto newsDto = new NewsDto();
        newsDto.setJournalistId(news.getJournalistId().getId());
        newsDto.setEditorId(news.getEditorId().getId());
        newsDto.setTitle(news.getTitle());
        newsDto.setNewsContent(news.getNewsContent());
        newsDto.setPublicationsDate(news.getPublicationsDate());
        newsDto.setSubject(news.getSubject());
        newsDto.setUserViews(news.getUserViews());
        newsDto.setNote(news.getNote());
        return newsDto;
    }
}
