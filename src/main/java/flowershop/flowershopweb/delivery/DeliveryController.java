package flowershop.flowershopweb.delivery;

import flowershop.flowershopweb.payments.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/delivery")
public class DeliveryController {
    private final DeliveryService deliveryService;

    @Autowired
    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping
    public List<Delivery> getDeliveries() {
        return deliveryService.getDeliveries();
    }

    @GetMapping(path = "/dhl")
    public String PaymentsCreditCard() {
        return deliveryService.getDeliveriesDHL();
    }

    @GetMapping(path = "/post")
    public String PaymentsPayPal() {
        return deliveryService.getDeliveriesPost();
    }

}
