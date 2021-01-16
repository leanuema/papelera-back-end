package serviceimpl;

import dto.PizzaBoxDto;
import dto.RavioliBoxDTO;
import service.RavioliBoxService;

import java.util.LinkedList;
import java.util.List;

public class RavioliBoxServiceImpl implements RavioliBoxService {
    @Override
    public List<RavioliBoxDTO> getAllRavioliBoxProduct() throws Exception {

        List<RavioliBoxDTO> productList = new LinkedList<>();

        RavioliBoxDTO product1 = new RavioliBoxDTO();
        product1.setId(1l);
        product1.setProductDescription("CAJA DE RAVIOLES STANDART");
        product1.setProductUnity(null);
        product1.setProductPrice(null);
        product1.setProductBTO(100);

        RavioliBoxDTO product2 = new RavioliBoxDTO();
        product2.setId(2l);
        product2.setProductDescription("CAJA DE RAVIOLES STANDART BCAS");
        product2.setProductUnity(null);
        product2.setProductPrice(992.0);
        product2.setProductBTO(100);

        RavioliBoxDTO product3 = new RavioliBoxDTO();
        product3.setId(3l);
        product3.setProductDescription("CAJA DE RAVIOLES CARTULINA BCAS");
        product3.setProductUnity(null);
        product3.setProductPrice(1.779);
        product3.setProductBTO(100);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return null;
    }
}
