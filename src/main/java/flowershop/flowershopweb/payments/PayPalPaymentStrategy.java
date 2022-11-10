package flowershop.flowershopweb.payments;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        if (price>=0){
            System.out.println("PayPal Payment success: your total: "+price);
            return true;
        }
        return false;
    }
}