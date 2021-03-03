package com.papelera.papeleraproject.configuration.enumerator;

public enum FeaturedStatusEnum {

    FEATURED_ID(0, "FEATURED"),
    FEATURED_DESCRIPTION(1, "NOT_FEATURED");

    private Integer id;
    private String description;

    FeaturedStatusEnum(Integer id, String description) {
        this.id = id;
        this.description = description;
    }


    /**
     *Getter and Setter
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
