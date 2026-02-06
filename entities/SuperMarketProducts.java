package entities;

public class SuperMarketProducts {

    private final String name;
    private final double price;

    public SuperMarketProducts(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
