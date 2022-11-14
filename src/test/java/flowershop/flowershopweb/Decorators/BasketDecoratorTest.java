package flowershop.flowershopweb.Decorators;

import flowershop.flowershopweb.decorators.BasketDecorator;
import flowershop.flowershopweb.decorators.PaperDecorator;
import flowershop.flowershopweb.flower.Flower;
import flowershop.flowershopweb.items.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class BasketDecoratorTest {

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Item item;

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        Flower flower = new Flower();
        flower.setPrice(price);
        item = new BasketDecorator(flower);
        Assertions.assertEquals(price+4, item.getPrice());
    }
}
