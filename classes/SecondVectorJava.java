package classes;

import entities.SuperMarketProducts;

import java.util.Locale;
import java.util.Scanner;

public class SecondVectorJava {

    public void run() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double avg = 0;
        SuperMarketProducts[] products = new SuperMarketProducts[n];

        for (int i  = 0; i < n; i++) {
            System.out.print("product name: ");
            String name = sc.nextLine();
            System.out.print("product price: ");
            double price = Double.parseDouble(sc.nextLine());
            products[i] = new SuperMarketProducts(name, price);
        }

        for(int i = 0; i < n; i++) {
            avg += products[i].getPrice();
        }

        System.out.println("AVERAGE PRICE = " + String.format("%.2f", avg/n));
    }
}
