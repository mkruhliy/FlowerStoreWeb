package flowershop.flowershopweb.delivery;

import flowershop.flowershopweb.flower.Flower;
import flowershop.flowershopweb.flower.FlowerColor;
import flowershop.flowershopweb.flower.FlowerType;
import flowershop.flowershopweb.items.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    public List<Delivery> getDeliveries () {
        return List.of(new DHLDeliveryStrategy(), new PostDeliveryStrategy());
    }

    public String getDeliveriesDHL() {
        Item flower1 = new Flower(1, FlowerType.TULIP, FlowerColor.RED, 1, 20);
        return new DHLDeliveryStrategy().deliver(List.of(flower1));
    }

    public String getDeliveriesPost() {
        Item flower1 = new Flower(1, FlowerType.TULIP, FlowerColor.RED, 2, 10);
        return new PostDeliveryStrategy().deliver(List.of(flower1));
    }
}
