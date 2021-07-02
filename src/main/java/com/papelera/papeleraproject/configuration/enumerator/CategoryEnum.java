package com.papelera.papeleraproject.configuration.enumerator;

public enum CategoryEnum {

    ADMIN(1L, "ADMIN"),
    CLIENT(2L, "CLIENT");

    private Long id;
    private String name;

    CategoryEnum(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Getter and Setter
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
