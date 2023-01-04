package leiden.iprwc.ecommerce.service;

import leiden.iprwc.ecommerce.dto.Purchase;
import leiden.iprwc.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
