package entities;

import java.util.Scanner;

public class Leitor {
    public Scanner sc;

    public Leitor() {
        this.sc = new Scanner(System.in);
    }

    public Scanner scanner() {
        return this.sc;
    }

    public Triangle criarTriangulo() {

        System.out.println("Enter the measures of the triangle: ");
        double a = this.sc.nextDouble();
        double b = this.sc.nextDouble();
        double c = this.sc.nextDouble();

        return new Triangle(a, b, c);
    }

    public Product criarProduto() {

        String name;
        double price;
        int quantity;

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        name = this.sc.nextLine();
        System.out.print("Price: ");
        price = this.sc.nextDouble();
        System.out.print("Quantity in stock: ");
        quantity = this.sc.nextInt();
        System.out.println();

        return new Product(name, price, quantity);
    }

    public void fecharLeitor() {
        this.sc.close();
    }
}
