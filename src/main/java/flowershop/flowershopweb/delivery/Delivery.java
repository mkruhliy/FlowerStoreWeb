package flowershop.flowershopweb.delivery;
import flowershop.flowershopweb.items.Item;

import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items);
}
