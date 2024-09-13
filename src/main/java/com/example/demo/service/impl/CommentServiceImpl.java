package com.example.demo.service.impl;

import com.example.demo.entity.Comment;
import com.example.demo.repository.CommentRepository;
import com.example.demo.service.spec.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getLastDaysComments(int n) {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime beforeN = now.minusDays(n);
        return commentRepository.findByPublicationsDateBetween(beforeN, now);
    }
}
