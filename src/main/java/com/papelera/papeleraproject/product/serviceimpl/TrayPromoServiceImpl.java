package serviceimpl;

import dto.TrayPromoDTO;
import service.TrayPromoService;

import java.util.LinkedList;
import java.util.List;

public class TrayPromoServiceImpl implements TrayPromoService {
    @Override
    public List<TrayPromoDTO> getAllTrayPromoProduct() throws Exception {

        List<TrayPromoDTO> productList = new LinkedList<>();

        TrayPromoDTO product1 = new TrayPromoDTO();
        product1.setId(1l);
        product1.setProductDescription("BANDEJA CARTON GRIS ACG N*1 ");
        product1.setProductUnity(null);
        product1.setProductPrice(1.425);
        product1.setProductBTO(1800);

        TrayPromoDTO product2 = new TrayPromoDTO();
        product2.setId(2l);
        product2.setProductDescription("BANDEJA CARTON GRIS ACG N*2");
        product2.setProductUnity(null);
        product2.setProductPrice(988.0);
        product2.setProductBTO(1000);

        TrayPromoDTO product3 = new TrayPromoDTO();
        product3.setId(3l);
        product3.setProductDescription("BANDEJA CARTON GRIS ACG N*5 ");
        product3.setProductUnity(null);
        product3.setProductPrice(1.542);
        product3.setProductBTO(800);

        TrayPromoDTO product4 = new TrayPromoDTO();
        product4.setId(4l);
        product4.setProductDescription("BANDEJA STD Nº12 ACG");
        product4.setProductUnity(null);
        product4.setProductPrice(2.476);
        product4.setProductBTO(1200);

        TrayPromoDTO product5 = new TrayPromoDTO();
        product5.setId(5l);
        product5.setProductDescription("BANDEJA STD Nº12 ½ ACG");
        product5.setProductUnity(null);
        product5.setProductPrice(2.858);
        product5.setProductBTO(1200);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);


        return productList;
    }
}
