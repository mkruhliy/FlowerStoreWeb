package flowershop.flowershopweb.items;

public abstract class Item {
    private String description;
    public String getDescription(){
        return this.description;
    }
    public abstract double getPrice();
}
