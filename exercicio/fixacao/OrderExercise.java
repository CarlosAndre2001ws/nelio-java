package exercicio.fixacao;

import entities.pedidoNItens.Product;
import entities.enums.OrderStatus;
import entities.pedidoNItens.Client;
import entities.pedidoNItens.Order;
import entities.pedidoNItens.OrderItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class OrderExercise {

    public static void run() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("Email: "); String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");  String birthDate = sc.nextLine();
        System.out.println("Enter order data:");
        System.out.print("Status: "); String status = sc.nextLine();
        System.out.print("How many items to this order ? ");  int itemsAmount = Integer.parseInt(sc.nextLine());
        Client client = new Client(name, email, sdf.parse(birthDate));
        Order order = new Order(client, OrderStatus.valueOf(status));
        for(int i = 0; i < itemsAmount; i++) {
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: "); String productName = sc.nextLine();
            System.out.print("Product price: "); double productPrice = Double.parseDouble(sc.nextLine());
            System.out.print("Product quantity: "); int productQuantity = Integer.parseInt(sc.nextLine());
            Product newProduct = new Product(productName, productPrice);
            OrderItem newOrderItem = new OrderItem(newProduct, productQuantity);
            order.addItem(newOrderItem);
        }

        order.getSummary();

        sc.close();
    }
}
