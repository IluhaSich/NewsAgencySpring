package com.example.demo.dto;

public class JournalistDto {
    private String fullName;
    private String contactInfo;
    private String specialization;

    public JournalistDto(String fullName, String contactInfo, String specialization) {
        this.fullName = fullName;
        this.contactInfo = contactInfo;
        this.specialization = specialization;
    }

    protected JournalistDto() {
    }

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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
