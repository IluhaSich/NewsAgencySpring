package com.example.demo.dto;

import java.time.ZonedDateTime;

public class CommentDto {
    private int id;
    private int newsId;
    private int userId;
    private String commentContent;
    private ZonedDateTime publicationsDate;

    public CommentDto(int id, int newsId, int userId, String commentContent, ZonedDateTime publicationsDate) {
        this.id = id;
        this.newsId = newsId;
        this.userId = userId;
        this.commentContent = commentContent;
        this.publicationsDate = publicationsDate;
    }

    public CommentDto(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public ZonedDateTime getPublicationsDate() {
        return publicationsDate;
    }

    public void setPublicationsDate(ZonedDateTime publicationsDate) {
        this.publicationsDate = publicationsDate;
    }
}
