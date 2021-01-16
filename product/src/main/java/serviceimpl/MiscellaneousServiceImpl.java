package serviceimpl;

import dto.EconomicRectCardboardTrayDTO;
import dto.MiscellaneousDTO;
import service.MiscellaneousService;

import java.util.LinkedList;
import java.util.List;

public class MiscellaneousServiceImpl implements MiscellaneousService {

    @Override
    public List<MiscellaneousDTO> getAllMiscellaneousProduct() throws Exception {

        List<MiscellaneousDTO> productList = new LinkedList<>();

        MiscellaneousDTO product1 = new MiscellaneousDTO();
        product1.setId(1l);
        product1.setProductDescription("TRIPODES P/ PIZZA");
        product1.setProductUnity("KG");
        product1.setProductPrice(135.0);
        product1.setProductBTO(10);

        MiscellaneousDTO product2 = new MiscellaneousDTO();
        product2.setId(2l);
        product2.setProductDescription("BOLSAS P/JUGO 4X30 ");
        product2.setProductUnity("Pack1000");
        product2.setProductPrice(702.0);
        product2.setProductBTO(10);

        MiscellaneousDTO product3 = new MiscellaneousDTO();
        product3.setId(3l);
        product3.setProductDescription("BOLSAS P/HORNO 30X45");
        product3.setProductUnity("10");
        product3.setProductPrice(64.0);
        product3.setProductBTO(10);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);


        return productList;



    }
}
