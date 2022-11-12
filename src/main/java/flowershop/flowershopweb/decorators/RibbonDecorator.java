package flowershop.flowershopweb.decorators;

import flowershop.flowershopweb.items.Item;

public class RibbonDecorator extends ItemDecorator{
    private Item item;

    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
