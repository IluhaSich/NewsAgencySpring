package com.example.demo.repository;

import com.example.demo.entity.News;
import com.example.demo.repository.baseRepository.BaseNewsRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;
import java.util.List;

@Repository
public interface NewsRepository extends BaseNewsRepository<News,Long> {

    List<News> findByEditorIdNotNull();

    @Query("SELECT n FROM News n " +
            "WHERE LOWER(n.title) LIKE %:search% " +
            "OR LOWER(n.subject) LIKE %:search% " +
            "And n.editorId IS NOT NULL")
    List<News> findByTitleOrSubject(@Param("search") String search);

    @Query("SELECT n FROM News n " +
        "LEFT JOIN Comment c ON n.id = c.newsId.id " +
        "WHERE c.publicationsDate BETWEEN :now AND :daysAgo " +
        "GROUP BY n.id " +
        "ORDER BY COUNT(c.newsId.id) DESC")
//        "LIMIT 5", nativeQuery = true)
    List<News> findMostPopularNews(@Param("now")ZonedDateTime now,
                                             @Param("daysAgo") ZonedDateTime daysAgo,
                                             Pageable pageable);

}
