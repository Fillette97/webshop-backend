package leiden.iprwc.ecommerce.service;

import leiden.iprwc.ecommerce.dao.ProductRepository;
import leiden.iprwc.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;


    public void delete(Long id)
    {
        productRepository.deleteById(id);
    }

    //updating a record
    public void update(Product product, Long id)
    {
        productRepository.save(product);
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Product product)
    {
        System.out.println(product);
        productRepository.save(product);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
