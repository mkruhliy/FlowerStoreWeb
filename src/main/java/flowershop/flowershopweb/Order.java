package flowershop.flowershopweb;

import flowershop.flowershopweb.delivery.DHLDeliveryStrategy;
import flowershop.flowershopweb.delivery.Delivery;
import flowershop.flowershopweb.flower.*;
import flowershop.flowershopweb.items.Item;
import flowershop.flowershopweb.payments.PayPalPaymentStrategy;
import flowershop.flowershopweb.payments.Payment;
import flowershop.flowershopweb.user.Receiver;
import flowershop.flowershopweb.user.Sender;
import flowershop.flowershopweb.user.User;
import lombok.Getter;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static flowershop.flowershopweb.flower.FlowerColor.BLUE;
import static flowershop.flowershopweb.flower.FlowerColor.RED;
import static flowershop.flowershopweb.flower.FlowerType.CHAMOMILE;
import static flowershop.flowershopweb.flower.FlowerType.TULIP;

public class Order {
    @Getter
    private List<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;

    private List<User> users = new ArrayList<>();

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item: getItems()) {
            price += item.getPrice();
        }
        return price;
    }

    public boolean processOrder(){
        double price = calculateTotalPrice();
        System.out.println(payment.pay(price));
        notifyUsers();
        System.out.println(delivery.deliver(items));
        notifyUsers();
        return true;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers() {
        for (User user: users) {
            user.update();
//            System.out.println(user.getStatus());
        }
    }




    public static void main(String[] args) {

        Order order = new Order();


        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        order.addUser(sender);
        order.addUser(receiver);

        System.out.println(sender.getStatus());
        System.out.println(receiver.getStatus());


        FlowerBucket flowerBucket1 = new FlowerBucket();
        FlowerBucket flowerBucket2 = new FlowerBucket();
        flowerBucket1.add(new FlowerPack(new Flower(1, TULIP, RED, 2.4, 10), 5));
        flowerBucket1.add(new FlowerPack(new Flower(2, TULIP, BLUE, 2.4, 10), 5));
        flowerBucket2.add(new FlowerPack(new Flower(3, CHAMOMILE, RED, 1, 20), 3));
        flowerBucket2.add(new FlowerPack(new Flower(4, CHAMOMILE, BLUE, 1, 20), 3));
        order.addItem(flowerBucket1);
        order.addItem(flowerBucket2);


        Payment payment = new PayPalPaymentStrategy();
        order.setPaymentStrategy(payment);

        Delivery delivery = new DHLDeliveryStrategy();
        order.setDeliveryStrategy(delivery);

//        order.processOrder();

        double price = order.calculateTotalPrice();
        System.out.println(payment.pay(price));
        order.notifyUsers();

        System.out.println(sender.getStatus());
        System.out.println(receiver.getStatus());

        System.out.println(delivery.deliver(order.getItems()));
        order.notifyUsers();

        System.out.println(sender.getStatus());
        System.out.println(receiver.getStatus());


        order.notifyUsers();

        System.out.println(sender.getStatus());
        System.out.println(receiver.getStatus());
    }
}
