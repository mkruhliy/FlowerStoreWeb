package flowershop.flowershopweb.Delivers;

import flowershop.flowershopweb.delivery.DHLDeliveryStrategy;
import flowershop.flowershopweb.delivery.Delivery;
import flowershop.flowershopweb.flower.Flower;
import flowershop.flowershopweb.items.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DHLDeliveryTest {
    private Delivery dhlDeliveryStrategy;

    @BeforeEach
    public void init() {
        dhlDeliveryStrategy = new DHLDeliveryStrategy();
    }

    @Test
    public void testDeliverNotEmpty() {
        List<Item> items = new ArrayList<>();
        items.add(new Flower());
        Assertions.assertNotEquals("Delivery failure", dhlDeliveryStrategy.deliver(items));
    }

    @Test
    public void testDeliverEmpty() {
        List<Item> items = new ArrayList<>();
        Assertions.assertEquals("Delivery failure", dhlDeliveryStrategy.deliver(items));
    }
}
