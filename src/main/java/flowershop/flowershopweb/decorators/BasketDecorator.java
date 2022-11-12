package flowershop.flowershopweb.decorators;

import flowershop.flowershopweb.items.Item;

public class BasketDecorator extends ItemDecorator{
    private Item item;

    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
