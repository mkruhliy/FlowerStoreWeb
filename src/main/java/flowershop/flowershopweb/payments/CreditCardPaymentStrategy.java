package flowershop.flowershopweb.payments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCardPaymentStrategy implements Payment{
    private String name;

    public CreditCardPaymentStrategy(){
        this.name = "Credit Card";
    }

    @Override
    public String pay(double price) {
        if (price>=0){
            return "Credit card Payment success: your total: "+price;
        }
        return "Credit card Payment failure";
    }
}
