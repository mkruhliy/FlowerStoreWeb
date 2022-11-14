package flowershop.flowershopweb.Flower;

import flowershop.flowershopweb.flower.Flower;
import flowershop.flowershopweb.flower.FlowerPack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class FlowerPackTest {

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerPack flowerPack;

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);

        Flower flower = new Flower();
        flower.setPrice(price);
        flowerPack = new FlowerPack(flower, quantity);
        Assertions.assertEquals(price*quantity, flowerPack.getPrice());
    }
}
