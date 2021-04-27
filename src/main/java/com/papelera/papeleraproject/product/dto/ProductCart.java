package com.papelera.papeleraproject.product.dto;

import java.io.Serializable;
import java.util.List;

public class ProductCart implements Serializable {

    private static final long serialVersionUID = -250456501243097773L;

    private List<AluminumProductDTO> aluminumProductDTO;
    private List<CardboardProductDTO> cardboardProductDTO;
    private List<OtherProductDTO> otherProductDTO;
    private List<PaperProductDTO> paperProductDTO;
    private List<PlasticProductDTO> plasticProductDTO;

    public ProductCart() {
    }

    public ProductCart(List<AluminumProductDTO> aluminumProductDTO,
                       List<CardboardProductDTO> cardboardProductDTO,
                       List<OtherProductDTO> otherProductDTO,
                       List<PaperProductDTO> paperProductDTO,
                       List<PlasticProductDTO> plasticProductDTO) {
        this.aluminumProductDTO = aluminumProductDTO;
        this.cardboardProductDTO = cardboardProductDTO;
        this.otherProductDTO = otherProductDTO;
        this.paperProductDTO = paperProductDTO;
        this.plasticProductDTO = plasticProductDTO;
    }

    /**
     * Getter and Setter
     */
    public List<AluminumProductDTO> getAluminumProductDTO() {
        return aluminumProductDTO;
    }

    public void setAluminumProductDTO(List<AluminumProductDTO> aluminumProductDTO) {
        this.aluminumProductDTO = aluminumProductDTO;
    }

    public List<CardboardProductDTO> getCardboardProductDTO() {
        return cardboardProductDTO;
    }

    public void setCardboardProductDTO(List<CardboardProductDTO> cardboardProductDTO) {
        this.cardboardProductDTO = cardboardProductDTO;
    }

    public List<OtherProductDTO> getOtherProductDTO() {
        return otherProductDTO;
    }

    public void setOtherProductDTO(List<OtherProductDTO> otherProductDTO) {
        this.otherProductDTO = otherProductDTO;
    }

    public List<PaperProductDTO> getPaperProductDTO() {
        return paperProductDTO;
    }

    public void setPaperProductDTO(List<PaperProductDTO> paperProductDTO) {
        this.paperProductDTO = paperProductDTO;
    }

    public List<PlasticProductDTO> getPlasticProductDTO() {
        return plasticProductDTO;
    }

    public void setPlasticProductDTO(List<PlasticProductDTO> plasticProductDTO) {
        this.plasticProductDTO = plasticProductDTO;
    }
}
