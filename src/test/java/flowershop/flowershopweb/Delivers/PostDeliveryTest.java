package flowershop.flowershopweb.Delivers;

import flowershop.flowershopweb.delivery.PostDeliveryStrategy;
import flowershop.flowershopweb.flower.Flower;
import flowershop.flowershopweb.items.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PostDeliveryTest {
    private PostDeliveryStrategy postDeliveryStrategy;

    @BeforeEach
    public void init() {
        postDeliveryStrategy = new PostDeliveryStrategy();
    }

    @Test
    public void testDeliverNotEmpty() {
        List<Item> items = new ArrayList<>();
        items.add(new Flower());
        Assertions.assertNotEquals("Delivery failure", postDeliveryStrategy.deliver(items));
    }

    @Test
    public void testDeliverEmpty() {
        List<Item> items = new ArrayList<>();
        Assertions.assertEquals("Delivery failure", postDeliveryStrategy.deliver(items));
    }
}
