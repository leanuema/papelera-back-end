package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.EconomicRectCardboardTrayDTO;
import com.papelera.papeleraproject.product.service.EconomicRectCardboardTrayService;

import java.util.LinkedList;
import java.util.List;

public class EconomicRectCardboardTrayServiceImpl implements EconomicRectCardboardTrayService {

    @Override
    public List<EconomicRectCardboardTrayDTO> getAllEconomicRectCardboardTrayProduct() throws Exception {
        List<EconomicRectCardboardTrayDTO> productList = new LinkedList<>();

        EconomicRectCardboardTrayDTO product1 = new EconomicRectCardboardTrayDTO();
        product1.setId(1l);
        product1.setProductDescription("BANDEJA CARTON GRIS N° 1 ROMA");
        product1.setProductUnity("Bulto");
        product1.setProductPrice(1.708);
        product1.setProductBTO(1600);

        EconomicRectCardboardTrayDTO product2 = new EconomicRectCardboardTrayDTO();
        product2.setId(2l);
        product2.setProductDescription("BANDEJA CARTON GRIS N° 2 ROMA");
        product2.setProductUnity("Bulto");
        product2.setProductPrice(1.599);
        product2.setProductBTO(1200);

        EconomicRectCardboardTrayDTO product3 = new EconomicRectCardboardTrayDTO();
        product3.setId(3l);
        product3.setProductDescription("BANDEJA CARTON GRIS N° 3 ROMA");
        product3.setProductUnity("Bulto");
        product3.setProductPrice(1.914);
        product3.setProductBTO(1200);

        EconomicRectCardboardTrayDTO product4 = new EconomicRectCardboardTrayDTO();
        product4.setId(4l);
        product4.setProductDescription("BANDEJA CARTON GRIS N° 4 ROMA");
        product4.setProductUnity("Bulto");
        product4.setProductPrice(1.686);
        product4.setProductBTO(800);

        EconomicRectCardboardTrayDTO product5 = new EconomicRectCardboardTrayDTO();
        product5.setId(5l);
        product5.setProductDescription("BANDEJA CARTON GRIS N° 5 ROMA");
        product5.setProductUnity("Bulto");
        product5.setProductPrice(2.081);
        product5.setProductBTO(800);

        EconomicRectCardboardTrayDTO product6 = new EconomicRectCardboardTrayDTO();
        product6.setId(6l);
        product6.setProductDescription("BANDEJA CARTON GRIS N° 6 ROMA");
        product6.setProductUnity("Bulto");
        product6.setProductPrice(2.029);
        product6.setProductBTO(600);

        EconomicRectCardboardTrayDTO product7 = new EconomicRectCardboardTrayDTO();
        product7.setId(7l);
        product7.setProductDescription("BANDEJA CARTON GRIS N° 7 ROMA");
        product7.setProductUnity("Bulto");
        product7.setProductPrice(1.701);
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
