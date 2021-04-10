package com.papelera.papeleraproject.product.resource;

import com.papelera.papeleraproject.product.dto.PaperProductDTO;
import com.papelera.papeleraproject.product.endpoint.PaperProductEndPoint;
import com.papelera.papeleraproject.product.model.PaperProductModel;
import com.papelera.papeleraproject.product.service.PaperProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = PaperProductEndPoint.BASE_URL)
public class PaperProductResource implements PaperProductEndPoint {

    @Autowired
    PaperProductService paperProductService;

    @Override
    @GetMapping(value = PaperProductEndPoint.GET_ALL_PAPER_PRODUCT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PaperProductDTO> getAllPaperProduct() throws Exception {
        return paperProductService.getAllPaperProduct();
    }

    @Override
    @GetMapping(value = PaperProductEndPoint.GET_paper_PRODUCT_BY_ID,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PaperProductDTO findByProductId(@RequestParam("productId") Long productId) throws Exception {
        return paperProductService.findByProductId(productId);
    }

    @Override
    @GetMapping(value = PaperProductEndPoint.GET_PRODUCT_BY_STATUS,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PaperProductDTO> getStockAvailableProducts(@RequestParam("statusId") Integer statusId) throws Exception {
        return paperProductService.getStockAvailableProducts(statusId);
    }

    @Override
    @PutMapping(value = PaperProductEndPoint.MODIFY_PRODUCT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void modifyProduct(@RequestBody PaperProductDTO paperProductDTO) throws Exception {
        paperProductService.modifyProduct(paperProductDTO);
    }

    @Override
    @PostMapping(value = PaperProductEndPoint.CREATING_PRODUCT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createProduct(@RequestBody PaperProductDTO paperProductDTO) throws Exception {
        paperProductService.createProduct(paperProductDTO);
    }

    @Override
    @GetMapping(value = PaperProductEndPoint.GET_PAPER_PRODUCT_BY_FEATURED_STATUS,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PaperProductDTO> findProductByFeaturedStatusId(@RequestParam("featuredId") Long featuredId) throws Exception {
        return paperProductService.findProductByFeaturedStatusId(featuredId);
    }
}
