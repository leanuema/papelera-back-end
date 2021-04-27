package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.ProductCart;
import com.papelera.papeleraproject.product.service.MessengerService;
import org.springframework.stereotype.Service;

@Service
public class MessengerServiceImpl implements MessengerService {

    @Override
    public void sendMsj(ProductCart productCart) throws Exception {

    }

    @Override
    public ProductCart getMsg() throws Exception {
        return null;
    }
}
