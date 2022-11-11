package flowershop.flowershopweb.flower;

import flowershop.flowershopweb.items.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FlowerPack extends Item {
    private Flower flower;
    private int amount;
    public double getPrice() {
        return flower.getPrice() * amount;
    }
    @Override
    public String getDescription() {
        return "FlowerPack{" +
                "flower=" + flower.getDescription() +
                ", amount=" + amount +
                '}';
    }

//    public static void main(String[] args) {
//        Item flowerpack = new FlowerPack(new Flower(TULIP, RED, 2.4, 10), 5);
//        System.out.println(flowerpack.getDescription());
//    }
}