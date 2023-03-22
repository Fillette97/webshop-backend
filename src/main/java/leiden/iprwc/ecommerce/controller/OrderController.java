//package leiden.iprwc.ecommerce.controller;
//
//import leiden.iprwc.ecommerce.dao.CustomerRepository;
//import leiden.iprwc.ecommerce.dao.OrderRepository;
//import leiden.iprwc.ecommerce.entity.Customer;
//import leiden.iprwc.ecommerce.entity.Order;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RequestMapping("/api/orders/")
//@RestController
//public class OrderController {
//
//    @Autowired
//    private OrderRepository orderRepository;
//
//    @Autowired
//    private CustomerRepository customerRepository;
//
////    @GetMapping("findByCustomerEmail")
////    public List<Order> findByEmail(@RequestParam String email){
////       List<Customer> customers = customerRepository.findCustomersByEmail(email);
////       List<Order> allOrders = new ArrayList<>();
////        for (Customer c : customers) {
////            System.out.println("this is c" + c.getId());
////           Order order = orderRepository.findByCustomer(c);
////          allOrders.add(order);
////        }
////        return allOrders;
////    }
//
//
//}
