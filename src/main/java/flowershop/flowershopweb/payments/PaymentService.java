package flowershop.flowershopweb.payments;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    public List<Payment> getPayments() {
        return List.of(new PayPalPaymentStrategy(), new CreditCardPaymentStrategy());
    }

    public String getPaymentsCreditCard () {
        return new CreditCardPaymentStrategy().pay(10);
    }

    public String getPaymentsPayPal () {
        return new PayPalPaymentStrategy().pay(15);
    }
}
