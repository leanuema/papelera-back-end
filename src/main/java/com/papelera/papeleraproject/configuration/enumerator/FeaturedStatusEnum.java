package com.papelera.papeleraproject.configuration.enumerator;

public enum FeaturedStatusEnum {

    FEATURED(1L, "FEATURED"),
    NOT_FEATURED(2L, "NOT_FEATURED");

    private Long id;
    private String description;

    FeaturedStatusEnum(Long id, String description) {
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
