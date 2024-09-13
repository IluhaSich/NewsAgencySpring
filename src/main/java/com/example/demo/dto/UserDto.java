package com.example.demo.dto;

import java.time.LocalDate;

public class UserDto {
    private String nickname;
    private LocalDate registrationDate;

    public UserDto(String nickname, LocalDate registrationDate) {
        this.nickname = nickname;
        this.registrationDate = registrationDate;
    }

    protected UserDto() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
