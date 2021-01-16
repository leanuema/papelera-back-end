package serviceimpl;

import dto.EconomicRectCardboardTrayDTO;
import dto.RectWhiteCardboardTrayDTO;
import service.RectWhiteCardboardTrayService;

import java.util.LinkedList;
import java.util.List;

public class RectWhiteCardboardTrayServiceImpl implements RectWhiteCardboardTrayService {
    @Override
    public List<RectWhiteCardboardTrayDTO> getAllRectWhiteCardboardTrayProduct() throws Exception {

        List<RectWhiteCardboardTrayDTO> productList = new LinkedList<>();

        RectWhiteCardboardTrayDTO product1 = new RectWhiteCardboardTrayDTO();
        product1.setId(1l);
        product1.setProductDescription("BANDEJA DE CARTON BCO N° 1 ROMA");
        product1.setProductUnity("Bulto");
        product1.setProductPrice(2.454 );
        product1.setProductBTO(1600);

        RectWhiteCardboardTrayDTO product2 = new RectWhiteCardboardTrayDTO();
        product2.setId(2l);
        product2.setProductDescription("BANDEJA DE CARTON BCO N° 2 ROMA");
        product2.setProductUnity("Bulto");
        product2.setProductPrice(2.185);
        product2.setProductBTO(1200);

        RectWhiteCardboardTrayDTO product3 = new RectWhiteCardboardTrayDTO();
        product3.setId(3l);
        product3.setProductDescription("BANDEJA DE CARTON BCO N° 3 ROMA");
        product3.setProductUnity("Bulto");
        product3.setProductPrice(2.620);
        product3.setProductBTO(1200);

        RectWhiteCardboardTrayDTO product4 = new RectWhiteCardboardTrayDTO();
        product4.setId(4l);
        product4.setProductDescription("BANDEJA DE CARTON BCO N° 4 ROMA");
        product4.setProductUnity("Bulto");
        product4.setProductPrice(2.259);
        product4.setProductBTO(800);

        RectWhiteCardboardTrayDTO product5 = new RectWhiteCardboardTrayDTO();
        product5.setId(5l);
        product5.setProductDescription("BANDEJA DE CARTON BCO N° 5 ROMA");
        product5.setProductUnity("Bulto");
        product5.setProductPrice(3.160);
        product5.setProductBTO(800);

        RectWhiteCardboardTrayDTO product6 = new RectWhiteCardboardTrayDTO();
        product6.setId(6l);
        product6.setProductDescription("BANDEJA DE CARTON BCO N° 6 ROMA");
        product6.setProductUnity("Bulto");
        product6.setProductPrice(3.521);
        product6.setProductBTO(600);

        RectWhiteCardboardTrayDTO product7 = new RectWhiteCardboardTrayDTO();
        product7.setId(7l);
        product7.setProductDescription("BANDEJA DE CARTON BCO N° 7 ROMA ");
        product7.setProductUnity("Bulto");
        product7.setProductPrice(2.469);
        product7.setProductBTO(400);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);

        return productList;

    }
}
