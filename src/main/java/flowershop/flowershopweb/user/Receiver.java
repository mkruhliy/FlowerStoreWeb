package flowershop.flowershopweb.user;

import lombok.Getter;

@Getter
public class Receiver implements User {

    private UserStatus status;

    public Receiver() {
        this.status = UserStatus.SUCCESS;
    }

    @Override
    public void update() {
        switch (status) {
            case SUCCESS -> this.status = UserStatus.WAITING;
            case WAITING -> this.status = UserStatus.DELIVERY;
            case DELIVERY -> this.status = UserStatus.SUCCESS;
        }
    }

//    public static void main(String[] args) {
//        Receiver receiver = new Receiver();
//        receiver.update();
//        receiver.update();
//        System.out.println(receiver.getStatus());
//    }
}
