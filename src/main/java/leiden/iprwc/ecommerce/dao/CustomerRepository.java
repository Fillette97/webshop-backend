package leiden.iprwc.ecommerce.dao;

import leiden.iprwc.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCustomersByEmail(String email);


}
