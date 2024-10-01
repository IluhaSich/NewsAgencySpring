package com.example.demo.dto;

import java.time.ZonedDateTime;

public class NewsDto {
    private Integer journalistId;
    private Integer editorId;
    private String title;
    private String newsContent;
    private ZonedDateTime publicationsDate;
    private String subject;
    private Integer userViews;
    private String note;

    public NewsDto(Integer journalistId, Integer editorId, String title, String newsContent, ZonedDateTime publicationsDate, String subject, Integer userViews, String note) {
        this.journalistId = journalistId;
        this.editorId = editorId;
        this.title = title;
        this.newsContent = newsContent;
        this.publicationsDate = publicationsDate;
        this.subject = subject;
        this.userViews = userViews;
        this.note = note;
    }

    public NewsDto() {
    }

    public Integer getJournalistId() {
        return journalistId;
    }

    public void setJournalistId(Integer journalistId) {
        this.journalistId = journalistId;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public ZonedDateTime getPublicationsDate() {
        return publicationsDate;
    }

    public void setPublicationsDate(ZonedDateTime publicationsDate) {
        this.publicationsDate = publicationsDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getUserViews() {
        return userViews;
    }

    public void setUserViews(Integer userViews) {
        this.userViews = userViews;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
