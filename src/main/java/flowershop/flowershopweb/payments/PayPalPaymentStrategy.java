package flowershop.flowershopweb.payments;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayPalPaymentStrategy implements Payment{
    private String name;

    public PayPalPaymentStrategy(){
        this.name = "PayPal";
    }

    @Override
    public String pay(double price) {
        if (price>=0){
            return "PayPal Payment success: your total: "+price;
        }
        return "PayPal Payment failure";
    }
}