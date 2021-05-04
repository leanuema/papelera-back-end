package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.ProductInCartDTO;
import com.papelera.papeleraproject.product.service.MessengerService;
import org.springframework.stereotype.Service;

@Service
public class MessengerServiceImpl implements MessengerService {

    @Override
    public void sendMsj(ProductInCartDTO productInCartDTO) throws Exception {

    }

    @Override
    public ProductInCartDTO getMsg() throws Exception {
        return null;
    }
}
