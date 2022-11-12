package flowershop.flowershopweb.payments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @GetMapping
    public List<Payment> getPayments() {
        return paymentService.getPayments();
    }

    @GetMapping(path = "/credit_card")
    public String PaymentsCreditCard() {
        return paymentService.getPaymentsCreditCard();
    }

    @GetMapping(path = "/paypal")
    public String PaymentsPayPal() {
        return paymentService.getPaymentsPayPal();
    }
}
