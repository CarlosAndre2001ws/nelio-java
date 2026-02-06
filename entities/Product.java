package entities;

public class Product {
    private final String name;
    private final double price;
    private int quantity;
    private double total;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
         this.total = this.quantity * this.price;
        this.productData();
    }

    public void setTotal(int quantity) {
        this.total += quantity * this.price;
    }

    public void productData() {
        System.out.printf("Product data %s, $ %.2f, %d units, Total: $ %.2f%n", this.name, this.price, this.quantity, this.total);
    }

    public void addProductData(int quantity) {
        this.setTotal(quantity);
        this.updatedProductData();
    }

    public void removeProductsData(int quantity) {
        this.setTotal(-quantity);
        this.updatedProductData();
    }

    public void updatedProductData() {
        System.out.println();
        System.out.printf("Updated data %s, $ %.2f, %d units, Total: $ %.2f%n", this.name, this.price, this.quantity, this.total);
    }
}
