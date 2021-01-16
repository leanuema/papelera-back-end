package serviceimpl;

import dto.HotDogAndFriesTrayDTO;
import dto.MiscellaneousDTO;
import service.HotDogAndFriesService;

import java.util.LinkedList;
import java.util.List;

public class HotDogAndFriesServiceImpl implements HotDogAndFriesService {
    @Override
    public List<HotDogAndFriesTrayDTO> getAllHotDogAndFriesProduct() throws Exception {

        List<HotDogAndFriesTrayDTO> productList = new LinkedList<>();

        HotDogAndFriesTrayDTO product1 = new HotDogAndFriesTrayDTO();
        product1.setId(1l);
        product1.setProductDescription("PORTAPANCHOS");
        product1.setProductUnity("PAQ");
        product1.setProductPrice(428.0);
        product1.setProductBTO(500);

        HotDogAndFriesTrayDTO product2 = new HotDogAndFriesTrayDTO();
        product2.setId(2l);
        product2.setProductDescription("CUCURUCHO P/ FRITAS");
        product2.setProductUnity("PAQ");
        product2.setProductPrice(785.0);
        product2.setProductBTO(500);



        productList.add(product1);
        productList.add(product2);



        return productList;


    }
}
