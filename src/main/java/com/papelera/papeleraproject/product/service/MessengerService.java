package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.ProductCart;

public interface MessengerService {

    void sendMsj(ProductCart productCart) throws Exception;
    ProductCart getMsg() throws Exception;
}
