package serviceimpl;

import dto.PizzaBoxDto;
import dto.RectWhiteCardboardTrayDTO;
import service.PizzaBoxService;

import java.util.LinkedList;
import java.util.List;

public class PizzaBoxServiceImpl implements PizzaBoxService {
    @Override
    public List<PizzaBoxDto> getAllPizaBoxProdcut() throws Exception {

        List<PizzaBoxDto> productList = new LinkedList<>();

        PizzaBoxDto product1 = new PizzaBoxDto();
        product1.setId(1l);
        product1.setProductDescription("CAJA M/C GRANDE ");
        product1.setProductUnity(null);
        product1.setProductPrice(776.0 );
        product1.setProductBTO(50);

        PizzaBoxDto product2 = new PizzaBoxDto();
        product2.setId(2l);
        product2.setProductDescription("CAJA M/C CHICA");
        product2.setProductUnity(null);
        product2.setProductPrice(756.0);
        product2.setProductBTO(50);

        PizzaBoxDto product3 = new PizzaBoxDto();
        product3.setId(3l);
        product3.setProductDescription("CAJA BLANCAS GRANDE ");
        product3.setProductUnity(null);
        product3.setProductPrice(null);
        product3.setProductBTO(null);

        PizzaBoxDto product4 = new PizzaBoxDto();
        product4.setId(4l);
        product4.setProductDescription("CAJA BLANCAS CHICA");
        product4.setProductUnity(null);
        product4.setProductPrice(null);
        product4.setProductBTO(null);

        PizzaBoxDto product5 = new PizzaBoxDto();
        product5.setId(5l);
        product5.setProductDescription("CAJA GRIS GRANDE ");
        product5.setProductUnity(null);
        product5.setProductPrice(1.165);
        product5.setProductBTO(100);

        PizzaBoxDto product6 = new PizzaBoxDto();
        product6.setId(6l);
        product6.setProductDescription("CAJA GRIS CHICA");
        product6.setProductUnity(null);
        product6.setProductPrice(1.149);
        product6.setProductBTO(100);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        return productList;


    }
}
