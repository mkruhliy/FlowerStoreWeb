package flowershop.flowershopweb.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/pppayment")
public class PayPalPaymentController {
    @GetMapping
    public String getPayment() {
        return "Pay Pal Payment";
    }
}
