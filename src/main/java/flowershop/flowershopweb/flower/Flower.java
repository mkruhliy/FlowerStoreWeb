package flowershop.flowershopweb.flower;

import flowershop.flowershopweb.items.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Flower extends Item {
    @Id
    @GeneratedValue
    private int id;
    private FlowerType flowertype;
    private FlowerColor color;
    private double sepalLength;
    private double price;

    @Override
    public String getDescription() {
        return "Flower{" +
                "flowertype=" + flowertype +
                ", color=" + color +
                ", sepalLength=" + sepalLength +
                ", price=" + price +
                '}';
    }

    public String getColor() {
        return color.toString();
    }

//    public static void main(String[] args) {
//        Item tulip = new Flower(TULIP, RED, 2.4, 10);
//        System.out.println(tulip.getDescription());
//    }
}