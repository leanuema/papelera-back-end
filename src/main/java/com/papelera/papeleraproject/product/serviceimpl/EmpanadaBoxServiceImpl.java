package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.EmpanadaBoxDTO;
import com.papelera.papeleraproject.product.service.EmpanadaBoxService;

import java.util.LinkedList;
import java.util.List;

public class EmpanadaBoxServiceImpl implements EmpanadaBoxService {
    @Override
    public List<EmpanadaBoxDTO> getAllEmpanadaBoxProduct() throws Exception {

        List<EmpanadaBoxDTO> productList = new LinkedList<>();

        EmpanadaBoxDTO product1 = new EmpanadaBoxDTO();
        product1.setId(1l);
        product1.setProductDescription("CAJA EMP M/M 1 DOC");
        product1.setProductUnity(null);
        product1.setProductPrice(1.553);
        product1.setProductBTO(100);

        EmpanadaBoxDTO product2 = new EmpanadaBoxDTO();
        product2.setId(2l);
        product2.setProductDescription("CAJA EMPANADA M/CORRUG 1/2 DOC");
        product2.setProductUnity(null);
        product2.setProductPrice(1.526);
        product2.setProductBTO(100);

        EmpanadaBoxDTO product3 = new EmpanadaBoxDTO();
        product3.setId(3l);
        product3.setProductDescription("CAJA EMPANADA GRIS 1 DOC");
        product3.setProductUnity(null);
        product3.setProductPrice(1.060);
        product3.setProductBTO(100);

        EmpanadaBoxDTO product4 = new EmpanadaBoxDTO();
        product4.setId(4l);
        product4.setProductDescription("CAJA EMPANADA GRIS 1/2 DOC ");
        product4.setProductUnity(null);
        product4.setProductPrice(null);
        product4.setProductBTO(null);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        return productList;



    }
}
