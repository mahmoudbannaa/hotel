package com.expedia.dto;

public class UserInfoPersona {

    private String personaType;

    public UserInfoPersona() {
    }

    public UserInfoPersona(String personaType) {
        this.personaType = personaType;
    }

    public String getPersonaType() {
        return personaType;
    }

    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }
}
