package entities.enums;

public enum OrderStatus {

    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int statusValue;

    OrderStatus(int statusValue) {
        this.statusValue = statusValue;
    }

    public int getStatusValue() {
        return statusValue;
    }
}
