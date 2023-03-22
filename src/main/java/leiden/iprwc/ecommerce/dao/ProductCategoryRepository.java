package leiden.iprwc.ecommerce.dao;

import leiden.iprwc.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category", excerptProjection = ProductCategory.class)
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    ProductCategory findById(long id);
}
