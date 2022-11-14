package flowershop.flowershopweb.Payments;

import flowershop.flowershopweb.payments.CreditCardPaymentStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CreditCardTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private CreditCardPaymentStrategy creditCardPaymentStrategy;

    @BeforeEach
    public void init() {
        creditCardPaymentStrategy = new CreditCardPaymentStrategy();
    }

    @Test
    public void testPositivePrice() {
        float price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        Assertions.assertEquals("Credit card Payment success: your total: "+price, creditCardPaymentStrategy.pay(price));
    }

    @Test
    public void testNegativePrice() {
        double price = RANDOM_GENERATOR.nextInt(MAX_PRICE)-MAX_PRICE-1;
        Assertions.assertEquals("Credit card Payment failure", creditCardPaymentStrategy.pay(price));
    }
}
