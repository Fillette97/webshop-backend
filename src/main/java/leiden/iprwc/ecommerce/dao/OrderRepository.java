package leiden.iprwc.ecommerce.dao;

import leiden.iprwc.ecommerce.entity.Customer;
import leiden.iprwc.ecommerce.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//@RepositoryRestResource
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Page<Order> findByCustomerEmail(@Param("email")String email, Pageable pageable);

//    Order findOrderByCustomer(Customer customer);
}
