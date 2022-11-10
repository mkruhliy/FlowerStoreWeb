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

//    @Override
//    public String getDescription() {
//        return "FlowerBucket{" +
//                "flowerPacks=" + flowerPacks.stream().map(pack -> pack.getDescription()).collect(Collectors.joining(",")) +
//                '}';
//    }

//    public static void main(String[] args) {
//        FlowerBucket flowerBucket = new FlowerBucket();
//        flowerBucket.add(new FlowerPack(new Flower(TULIP, RED, 2.4, 10), 5));
//        flowerBucket.add(new FlowerPack(new Flower(CHAMOMILE, BLUE, 1, 20), 3));
//        System.out.println(flowerBucket.getPrice());
//        System.out.println(flowerBucket.getDescription());
//    }
}