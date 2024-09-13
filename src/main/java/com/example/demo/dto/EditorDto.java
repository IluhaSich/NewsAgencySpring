package com.example.demo.dto;

public class EditorDto {
    private String fullName;
    private String contactInfo;

    public EditorDto(String fullName, String contactInfo) {
        this.fullName = fullName;
        this.contactInfo = contactInfo;
    }

    public EditorDto() {}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
