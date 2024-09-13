package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "editor")
public class Editor extends BaseEntity{
    private String fullName;
    private String contactInfo;

    public Editor(String fullName, String contactInfo) {
        this.fullName = fullName;
        this.contactInfo = contactInfo;
    }

    private Editor() {
    }

    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    @Column(name = "contact_info")
    public String getContactInfo() {
        return contactInfo;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
