package serviceimpl;

import dto.CardboardStripAndDiscDTO;
import dto.HotDogAndFriesTrayDTO;
import service.CardboardStripAndDiscService;

import java.util.LinkedList;
import java.util.List;

public class CardboardStripAndDiscServiceImpl implements CardboardStripAndDiscService {
    @Override
    public List<CardboardStripAndDiscDTO> getAllCardboardStripAndDiscProduct() {

        List<CardboardStripAndDiscDTO> productList = new LinkedList<>();

        CardboardStripAndDiscDTO product1 = new CardboardStripAndDiscDTO();
        product1.setId(1l);
        product1.setProductDescription("TIRAS DE CARTON 40-50-60-70 CM ");
        product1.setProductUnity("KG");
        product1.setProductPrice(179.0);
        product1.setProductBTO(null);

        CardboardStripAndDiscDTO product2 = new CardboardStripAndDiscDTO();
        product2.setId(2l);
        product2.setProductDescription("DISCOS CARTON BCO 16-36 TODOS ");
        product2.setProductUnity("KG");
        product2.setProductPrice(133.31);
        product2.setProductBTO(null);



        productList.add(product1);
        productList.add(product2);



        return productList;
    }
}
