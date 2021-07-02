package com.papelera.papeleraproject.configuration.enumerator;

public enum UserRoleEnum {

    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

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
