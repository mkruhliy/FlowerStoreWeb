package flowershop.flowershopweb.Orders;

import flowershop.flowershopweb.Order;
import flowershop.flowershopweb.delivery.Delivery;
import flowershop.flowershopweb.delivery.PostDeliveryStrategy;
import flowershop.flowershopweb.flower.Flower;
import flowershop.flowershopweb.items.Item;
import flowershop.flowershopweb.payments.CreditCardPaymentStrategy;
import flowershop.flowershopweb.payments.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {

    private Order order;

    @BeforeEach
    public void init() {
        Flower flower = new Flower();
        flower.setPrice(10);
        Payment payment = new CreditCardPaymentStrategy();
        Delivery delivery = new PostDeliveryStrategy();


        order = new Order();
        order.addItem(flower);
        order.setPaymentStrategy(payment);
        order.setDeliveryStrategy(delivery);
    }

    @Test
    public void testOrder() {
        Assertions.assertTrue(order.processOrder());
    }
}
