package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.RoundCardboardTrayDTO;
import com.papelera.papeleraproject.product.service.RoundCardboardTrayService;

import java.util.LinkedList;
import java.util.List;

public class RoundCardboardTrayServiceImpl implements RoundCardboardTrayService {
    @Override
    public List<RoundCardboardTrayDTO> getAllRoundCardboardTrayProduct() throws Exception {

        List<RoundCardboardTrayDTO> productList = new LinkedList<>();

        RoundCardboardTrayDTO product1 = new RoundCardboardTrayDTO();
        product1.setId(1l);
        product1.setProductDescription("BANDEJA STD Nº12 ROMA");
        product1.setProductUnity("Bulto");
        product1.setProductPrice(3.335);
        product1.setProductBTO(1200);

        RoundCardboardTrayDTO product2 = new RoundCardboardTrayDTO();
        product2.setId(2l);
        product2.setProductDescription("BANDEJA STD Nº12 ½ ROMA");
        product2.setProductUnity("Bulto");
        product2.setProductPrice(3.209);
        product2.setProductBTO(1000);

        RoundCardboardTrayDTO product3 = new RoundCardboardTrayDTO();
        product3.setId(3l);
        product3.setProductDescription("BANDEJA STD Nº13 ROMA");
        product3.setProductUnity("Bulto");
        product3.setProductPrice(3.620);
        product3.setProductBTO(1000);

        RoundCardboardTrayDTO product4 = new RoundCardboardTrayDTO();
        product4.setId(4l);
        product4.setProductDescription("BANDEJA STD Nº13 ½ ROMA");
        product4.setProductUnity("Bulto");
        product4.setProductPrice(2.111);
        product4.setProductBTO(500);

        RoundCardboardTrayDTO product5 = new RoundCardboardTrayDTO();
        product5.setId(5l);
        product5.setProductDescription("BANDEJA STD Nº14 ROMA");
        product5.setProductUnity("Bulto");
        product5.setProductPrice(2.715);
        product5.setProductBTO(500);

        RoundCardboardTrayDTO product6 = new RoundCardboardTrayDTO();
        product6.setId(6l);
        product6.setProductDescription("BANDEJA STD Nº15 ROMA");
        product6.setProductUnity("Bulto");
        product6.setProductPrice(2.946);
        product6.setProductBTO(500);

        RoundCardboardTrayDTO product7 = new RoundCardboardTrayDTO();
        product7.setId(7l);
        product7.setProductDescription("BANDEJA STD Nº16 ROMA");
        product7.setProductUnity("Bulto");
        product7.setProductPrice(3.031);
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
