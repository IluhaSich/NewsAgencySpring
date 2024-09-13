package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "user_account")
public class User extends BaseEntity{
    private String nickname;
    private LocalDate  registrationDate;

    public User(String nickname, LocalDate registrationDate) {
        this.nickname = nickname;
        this.registrationDate = registrationDate;
    }

    protected User() {
    }

    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    @Column(name = "registration_date")
    public LocalDate  getRegistrationDate() {
        return registrationDate;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
