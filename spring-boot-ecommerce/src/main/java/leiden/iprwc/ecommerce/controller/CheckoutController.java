package leiden.iprwc.ecommerce.controller;

import leiden.iprwc.ecommerce.dto.Purchase;
import leiden.iprwc.ecommerce.dto.PurchaseResponse;
import leiden.iprwc.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.repository.init.ResourceReader.Type.JSON;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        System.out.println("This is purchase" + (purchase.toString()));
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}


