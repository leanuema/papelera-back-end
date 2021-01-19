package com.papelera.papeleraproject.configuration.enumerator;

public enum ProductStatusEnum {

    STOCK_AVAILABLE(1L, "STOCK_AVAILABLE"),
    STOCK_UNAVAILABLE(2L, "STOCK_UNAVAILABLE");

    private Long id;
    private String description;

    ProductStatusEnum(Long id, String description) {
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
