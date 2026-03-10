package entities.pedidoNItens;

public class OrderItem {

    private final int quantity;
    private final Double price;
    private final Product product;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = product.getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public Double subTotal() {
        return this.price * this.quantity;
    }
}
