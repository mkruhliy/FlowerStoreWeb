package flowershop.flowershopweb.delivery;
import flowershop.flowershopweb.items.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
