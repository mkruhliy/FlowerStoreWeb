package flowershop.flowershopweb.items;

public class ItemDiscount extends Item{
    private Item item;

    public ItemDiscount(Item item) {
        this.item = item;

    }

    @Override
    public String getDescription() {
        return "Description";
    }

    @Override
    public double getPrice() {
        return item.getPrice() * 0.2;
    }
}
