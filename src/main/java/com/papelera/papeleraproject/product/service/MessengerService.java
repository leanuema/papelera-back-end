package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.ProductInCartDTO;

public interface MessengerService {

    void sendMsj(ProductInCartDTO productInCartDTO) throws Exception;
    ProductInCartDTO getMsg() throws Exception;
}
