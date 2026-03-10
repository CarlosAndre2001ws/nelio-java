package entities.pedidoNItens;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {

    private final LocalDateTime moment = LocalDateTime.now();
    private final Client client;
    private final OrderStatus status;
    private final ArrayList<OrderItem> orderItems = new ArrayList<>();

    public Order(Client client, OrderStatus status) {
        this.client = client;
        this.status = status;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public Client getClient() {
        return client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void addItem(OrderItem item) {
        this.orderItems.add(item);
    }

    public double getTotal() {

        double total = 0;

        for(OrderItem orderItem : this.orderItems) {
            total += orderItem.subTotal();
        }

        return total;
    }

    public void getSummary() {
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Order moment: " + this.getMoment().format(dtf));
        System.out.println("Order status: " + this.getStatus());
        System.out.println("Client: " + this.getClient().getName() + " (" + sdf.format(this.getClient().getBirthDate()) + ") - " + this.getClient().getEmail());
        System.out.println("Order items:");
        for(OrderItem orderItem : this.orderItems) {
            System.out.println(orderItem.getProduct().getName() + ", $" +  String.format("%.2f",orderItem.getPrice()) + ", Quantity: " + orderItem.getQuantity() + ", Subtotal: $" + String.format("%.2f", orderItem.subTotal()));
        }
        System.out.println("Total price: $" + String.format("%.2f", this.getTotal()));
    }
}
