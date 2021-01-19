package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.HotDogAndFriesTrayDTO;

import java.util.List;

public interface HotDogAndFriesService {
    List<HotDogAndFriesTrayDTO> getAllHotDogAndFriesProduct() throws Exception;
}
