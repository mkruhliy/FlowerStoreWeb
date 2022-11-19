package flowershop.flowershopweb.user;

import lombok.Getter;

@Getter
public class Sender implements User {

    private UserStatus status;

    public Sender() {
        this.status = UserStatus.SUCCESS;
    }

    @Override
    public void update() {
        switch (status) {
            case SUCCESS -> this.status = UserStatus.PAYMENT;
            case PAYMENT -> this.status = UserStatus.WAITING;
            case WAITING -> this.status = UserStatus.SUCCESS;
        }
    }
}
