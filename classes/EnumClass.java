package classes;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class EnumClass {

    public static void run() {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
    }
}
