package flowershop.flowershopweb.delivery;
import flowershop.flowershopweb.items.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Random;


@Getter
@Setter
public class DHLDeliveryStrategy implements Delivery{
    private String name;

    public DHLDeliveryStrategy() {
        this.name = "DHL";
    }

    @Override
    public String deliver(List<Item> items) {
        if (items.isEmpty())
            return "Delivery failure";
        return "Your DHL delivery package number: "+new Random().nextInt(9999);
    }
}
