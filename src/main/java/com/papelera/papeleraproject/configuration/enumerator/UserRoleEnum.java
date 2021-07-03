package com.papelera.papeleraproject.configuration.enumerator;

public enum UserRoleEnum {

    ADMIN("ADMIN"),
    USER("USER");

    private String description;

    UserRoleEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
