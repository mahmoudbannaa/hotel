package com.expedia.dto;

public class UserInfo {

    private UserInfoPersona persona;
    private String userId;

    public UserInfo() {
    }

    public UserInfo(UserInfoPersona persona, String userId) {
        this.persona = persona;
        this.userId = userId;
    }

    public UserInfoPersona getPersona() {
        return persona;
    }

    public void setPersona(UserInfoPersona persona) {
        this.persona = persona;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
