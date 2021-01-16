package dto;

public class PlacematDTO {


    public Long id;
    public String productDescription;
    public String productUnity;
    public Double productPrice;
    public Integer productBTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductUnity() {
        return productUnity;
    }

    public void setProductUnity(String productUnity) {
        this.productUnity = productUnity;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductBTO() {
        return productBTO;
    }

    public void setProductBTO(Integer productBTO) {
        this.productBTO = productBTO;
    }
}
