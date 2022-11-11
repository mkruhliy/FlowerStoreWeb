package flowershop.flowershopweb.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/ccpayment")
public class CreditCardPaymentController {
    @GetMapping
    public String getPayment() {
        return "Credit card payment";
    }
}
