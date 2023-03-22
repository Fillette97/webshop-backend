package leiden.iprwc.ecommerce.controller;

import leiden.iprwc.ecommerce.dao.ProductCategoryRepository;
import leiden.iprwc.ecommerce.entity.Product;
import leiden.iprwc.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @DeleteMapping("admin-panel/productId/{productid}")
    private void deleteProduct(@PathVariable("productid") Long product_id) {
        productService.delete(product_id);
    }

    @PutMapping(path = "admin-panel/update-product", produces = "application/json")
    private Product update(@RequestBody Product product) {
        System.out.println("to be updated" + product);
        product.setCategory(productCategoryRepository.findById(1));
        productService.saveOrUpdate(product);

        return product;
    }
}
