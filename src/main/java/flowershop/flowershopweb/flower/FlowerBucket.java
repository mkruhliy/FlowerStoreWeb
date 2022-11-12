package flowershop.flowershopweb.flower;

import flowershop.flowershopweb.items.Item;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        return "FlowerBucket{" +
                "flowerPacks=" + flowerPacks.stream().map(pack -> pack.getDescription()).collect(Collectors.joining(",")) +
                '}';
    }

    public boolean search(Flower flower) {
        for (FlowerPack flowerPack: getFlowerPacks()) {
            if (flowerPack.getFlower().getDescription()
                    .equals(flower.getDescription())) {
                return true;
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        FlowerBucket flowerBucket = new FlowerBucket();
//        Flower fl2 = new Flower(1, TULIP, RED, 2.4, 10);
//        flowerBucket.add(new FlowerPack(fl2, 5));
//        flowerBucket.add(new FlowerPack(new Flower(2, CHAMOMILE, BLUE, 1, 20), 3));
//        System.out.println(flowerBucket.getPrice());
//        System.out.println(flowerBucket.getDescription());
//        Flower fl = new Flower(1, TULIP, RED, 2.4, 10);
//        System.out.println(flowerBucket.search(fl));
//    }
}