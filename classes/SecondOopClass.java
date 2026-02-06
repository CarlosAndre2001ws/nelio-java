package classes;

import entities.Leitor;
import entities.Product;

public class SecondOopClass {

    public SecondOopClass() {
        int quantity;
        Leitor sc = new Leitor();

        Product product = sc.criarProduto();
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.scanner().nextInt();
        product.addProductData(quantity);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.scanner().nextInt();
        product.removeProductsData(quantity);

        sc.fecharLeitor();
    }
}
