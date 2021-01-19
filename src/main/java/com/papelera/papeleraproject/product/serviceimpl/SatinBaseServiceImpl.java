package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.SatinBaseDTO;
import com.papelera.papeleraproject.product.service.SatinBaseService;

import java.util.LinkedList;
import java.util.List;

public class SatinBaseServiceImpl implements SatinBaseService {
    @Override
    public List<SatinBaseDTO> getAllSatinBaseProduct() throws Exception {

        List<SatinBaseDTO> productList = new LinkedList<>();

        SatinBaseDTO product1 = new SatinBaseDTO();
        product1.setId(1l);
        product1.setProductDescription("FONDO RAV. SATINADO 19x25");
        product1.setProductUnity("KG");
        product1.setProductPrice(176.0);
        product1.setProductBTO(10);

        SatinBaseDTO product2 = new SatinBaseDTO();
        product2.setId(2l);
        product2.setProductDescription("FONDO PIZZERO 33x33 ");
        product2.setProductUnity("KG");
        product2.setProductPrice(101.0);
        product2.setProductBTO(10);



        productList.add(product1);
        productList.add(product2);



        return productList;
    }
}
