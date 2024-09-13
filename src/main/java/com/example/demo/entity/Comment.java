package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
@Table(name = "news_comment")
public class Comment extends BaseEntity{
    private News newsId;
    private User userId;
    private String commentContent;
    private ZonedDateTime  publicationsDate;

    public Comment(News newsId, User userId, String commentContent, ZonedDateTime publicationsDate) {
        this.newsId = newsId;
        this.userId = userId;
        this.commentContent = commentContent;
        this.publicationsDate = publicationsDate;
    }

    protected Comment(){}

    @ManyToOne
    @JoinColumn(name = "news_id")
    public News getNewsId() {
        return newsId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User getUserId() {
        return userId;
    }

    @Column(name = "comment_content")
    public String getCommentContent() {
        return commentContent;
    }

    @Column(name = "publications_date")
    public ZonedDateTime  getPublicationsDate() {
        return publicationsDate;
    }

    public void setNewsId(News newsId) {
        this.newsId = newsId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public void setPublicationsDate(ZonedDateTime publicationsDate) {
        this.publicationsDate = publicationsDate;
    }
}
