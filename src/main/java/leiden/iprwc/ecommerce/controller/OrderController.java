package leiden.iprwc.ecommerce.controller;

import leiden.iprwc.ecommerce.dao.CustomerRepository;
import leiden.iprwc.ecommerce.dao.OrderRepository;
import leiden.iprwc.ecommerce.entity.Customer;
import leiden.iprwc.ecommerce.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@RequestMapping("api/orders")
@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

//    @GetMapping("search/findByCustomerEmail")
//    public List<Order> findByEmail(@RequestParam String email) {
//        List<Customer> customers = customerRepository.findByEmail(email);
//        List<Order> allOrders = new ArrayList<>();
//        for (Customer c : customers) {
//            Order order = orderRepository.findOrderByCustomer(c);
//            allOrders.add(order);
//        }
//        return allOrders;
//    }


}
