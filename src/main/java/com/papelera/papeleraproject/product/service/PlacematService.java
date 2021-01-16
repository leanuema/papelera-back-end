package service;

import dto.PlacematDTO;

import java.util.List;

public interface PlacematService {
    List<PlacematDTO> getAllPlacematProduct() throws Exception;
}
