package com.papelera.papeleraproject.configuration.enumerator;

public enum UserStatusEnum {

    USER_AVAILABLE(1L, "USER_AVAILABLE"),
    USER_UNAVAILABLE(2L, "USER_UNAVAILABLE");

    private Long id;
    private String description;

    UserStatusEnum(Long id, String description) {
        this.id = id;
        this.description = description;
    }


    /**
     *Getter and Setter
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
