package com.papelera.papeleraproject.configuration.enumerator;

public enum ProductStatusEnum {

    STOCK_UNAVAILABLE(0, "STOCK_UNAVAILABLE"),
    STOCK_AVAILABLE(1, "STOCK_AVAILABLE");

    private Integer id;
    private String description;

    ProductStatusEnum(Integer id, String description) {
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
