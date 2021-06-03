package com.papelera.papeleraproject.configuration.enumerator;

public enum ProductCategory {

    ALUMINUM_PRODUCT(1L, "aluminum-product"),
    CARDBOARD_PRODUCT(2L, "cardboard-product"),
    OTHER_PRODUCT(3L, "other-product"),
    PAPER_PRODUCT(4L, "paper-product"),
    PLASTIC_PRODUCT(5L, "plastic-product");

    private Long id;
    private String categoryName;

    ProductCategory(Long id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
