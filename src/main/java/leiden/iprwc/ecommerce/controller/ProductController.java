package leiden.iprwc.ecommerce.controller;

import leiden.iprwc.ecommerce.dao.ProductCategoryRepository;
import leiden.iprwc.ecommerce.dao.ProductRepository;
import leiden.iprwc.ecommerce.entity.Product;
import leiden.iprwc.ecommerce.entity.ProductCategory;
import leiden.iprwc.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/products")


public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @DeleteMapping("/productId/{productid}")
    private void deleteProduct(@PathVariable("productid") Long product_id) {

        productService.delete(product_id);
    }

    @GetMapping("admin-panel/test")
    @PreAuthorize("hasAuthority('Admin_product_editor')")
    private void testMark(Principal userInfo) {
//        return "Hi "+ principal.getName();
        System.out.println("User Name:: "+ userInfo);
//        productRepository.findAll();
    }

//    @RequestMapping("/userinfo")
//    public String userinfo(Model model, OAuth2AuthenticationToken authentication) {
//        OAuth2AuthorizedClient authorizedClient = this.getAuthorizedClient(authentication);
//        Map userAttributes = Collections.emptyMap();
//        String userInfoEndpointUri = authorizedClient.getClientRegistration()
//                .getProviderDetails().getUserInfoEndpoint().getUri();
//        if (!StringUtils.isEmpty(userInfoEndpointUri)) {    // userInfoEndpointUri is optional for OIDC Clients
//            userAttributes = WebClient.builder()
//                    .filter(oauth2Credentials(authorizedClient)).build()
//                    .get().uri(userInfoEndpointUri)
//                    .retrieve()
//                    .bodyToMono(Map.class).block();
//        }
//        model.addAttribute("userAttributes", userAttributes);
//        return "userinfo";
//    }

    private Object oauth2Credentials(OAuth2AuthorizedClient authorizedClient) {
        return null;
    }


    //creating put mapping that updates the product detail
    @PutMapping("/update-product")
    private Product update(@RequestBody Product product) {
        System.out.println("to be updated" + product);
        productService.saveOrUpdate(product);

        return product;
    }

}
