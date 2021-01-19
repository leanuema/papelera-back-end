package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.PlacematDTO;
import com.papelera.papeleraproject.product.service.PlacematService;

import java.util.LinkedList;
import java.util.List;

public class PlacematServiceImpl implements PlacematService {
    @Override
    public List<PlacematDTO> getAllPlacematProduct() throws Exception {

        List<PlacematDTO> productList = new LinkedList<>();

        PlacematDTO product1 = new PlacematDTO();
        product1.setId(1l);
        product1.setProductDescription("INDIVIDUALES IMPRESOS KRAFT");
        product1.setProductUnity("PAQ");
        product1.setProductPrice(457.0);
        product1.setProductBTO(200);

        PlacematDTO product2 = new PlacematDTO();
        product2.setId(2l);
        product2.setProductDescription("NDIVIDUALES IMPRESOS SULFITO");
        product2.setProductUnity("PAQ");
        product2.setProductPrice(457.0);
        product2.setProductBTO(200);

        PlacematDTO product3 = new PlacematDTO();
        product3.setId(3l);
        product3.setProductDescription("INDIVID. BLANCOS / KRAFT");
        product3.setProductUnity("PAQ");
        product3.setProductPrice(311.0);
        product3.setProductBTO(200);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);


        return productList;
    }
}
