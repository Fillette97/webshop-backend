package leiden.iprwc.ecommerce.service;

import leiden.iprwc.ecommerce.entity.Product;

public interface ProductService {

    void delete(Long product_id);

    void saveOrUpdate(Product product);
}
