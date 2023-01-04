package leiden.iprwc.ecommerce.controller;

import leiden.iprwc.ecommerce.entity.Product;
import leiden.iprwc.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @DeleteMapping("/productId/{productid}")
    private void deleteProduct(@PathVariable("productid") Long product_id)
    {

        productService.delete(product_id);
    }

    //creating put mapping that updates the book detail
    @PutMapping("/update-student/")
    private Product update(@RequestBody Product product)
    {
        productService.saveOrUpdate(product);
        return product;
    }

}
