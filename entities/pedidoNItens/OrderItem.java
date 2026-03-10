package entities.pedidoNItens;

public class OrderItem {

    private int quantity;
    private Double price;
    private Product product;

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
