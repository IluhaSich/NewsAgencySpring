package com.example.demo.repository;

import com.example.demo.entity.Comment;
import org.springframework.data.repository.CrudRepository;

import java.time.ZonedDateTime;
import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    List<Comment> findByPublicationsDateBetween(ZonedDateTime startDate, ZonedDateTime endDate);
}