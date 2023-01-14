package leiden.iprwc.ecommerce.controller;

import leiden.iprwc.ecommerce.dao.ProductRepository;
import leiden.iprwc.ecommerce.entity.Product;
import leiden.iprwc.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/products/admin-panel")


public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    ProductRepository productRepository;

    @DeleteMapping("/productId/{productid}")
    private void deleteProduct(@PathVariable("productid") Long product_id) {

        productService.delete(product_id);
    }
    @PreAuthorize("hasAuthority('Admin_product_editor')")
    @GetMapping("/mark")
    private void testMark(@AuthenticationPrincipal Principal userInfo) {
        System.out.println("User Name:: "+ userInfo.getName());
        productRepository.findAll();

    }


    //creating put mapping that updates the product detail
    @PutMapping("/update-product")
    private Product update(@RequestBody Product product) {
        productService.saveOrUpdate(product);

        return product;
    }

}
