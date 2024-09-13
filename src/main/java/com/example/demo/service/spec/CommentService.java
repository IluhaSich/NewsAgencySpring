package com.example.demo.service.spec;

import com.example.demo.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getLastDaysComments(int n);
}
