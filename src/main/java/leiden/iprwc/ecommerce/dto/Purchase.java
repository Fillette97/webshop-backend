package leiden.iprwc.ecommerce.dto;

import leiden.iprwc.ecommerce.entity.Address;
import leiden.iprwc.ecommerce.entity.Customer;
import leiden.iprwc.ecommerce.entity.Order;
import leiden.iprwc.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
