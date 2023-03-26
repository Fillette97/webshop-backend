package leiden.iprwc.ecommerce.service;

import leiden.iprwc.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {

    void delete(Long product_id);

    void saveOrUpdate(Product product);

    List<Product> findAllProducts();
}
