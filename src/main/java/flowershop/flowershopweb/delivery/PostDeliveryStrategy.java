package flowershop.flowershopweb.delivery;
import flowershop.flowershopweb.items.Item;
import java.util.List;
import java.util.Random;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items) {
        if (items.isEmpty())
            return false;

        System.out.println("Your Post delivery package number: "+new Random().nextInt(9999));
        return true;
    }
}
