package com.example.demo.repository;

import com.example.demo.entity.Comment;
import com.example.demo.repository.baseRepository.BaseCommentRepository;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;
import java.util.List;

@Repository
public interface CommentRepository extends BaseCommentRepository<Comment,Long> {
    List<Comment> findByPublicationsDateBetween(ZonedDateTime startDate, ZonedDateTime endDate);
}