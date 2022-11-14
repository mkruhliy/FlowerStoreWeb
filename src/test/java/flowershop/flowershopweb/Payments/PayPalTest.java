package flowershop.flowershopweb.Payments;

import flowershop.flowershopweb.payments.PayPalPaymentStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PayPalTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private PayPalPaymentStrategy payPalPaymentStrategy;

    @BeforeEach
    public void init() {
        payPalPaymentStrategy = new PayPalPaymentStrategy();
    }

    @Test
    public void testPositivePrice() {
        float price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        Assertions.assertEquals("PayPal Payment success: your total: "+price, payPalPaymentStrategy.pay(price));
    }

    @Test
    public void testNegativePrice() {
        double price = RANDOM_GENERATOR.nextInt(MAX_PRICE)-MAX_PRICE-1;
        Assertions.assertEquals("PayPal Payment failure", payPalPaymentStrategy.pay(price));
    }
}
