package service;

import dto.HotDogAndFriesTrayDTO;

import java.util.List;

public interface HotDogAndFriesService {
    List<HotDogAndFriesTrayDTO> getAllHotDogAndFriesProduct() throws Exception;
}
