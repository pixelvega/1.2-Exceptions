
package exercise1_1;

public class Main {

  public static void main(String[] args) {
    Sale sale = new Sale();
    Product product1 = new Product("Product 1", 10.1);
    sale.addProduct(product1);
    Product product2 = new Product("Product 2", 20.1);
    sale.addProduct(product2);
    Product product3 = new Product("Product 3", 30.1);
    sale.addProduct(product3);

    try {
      sale.calcTotal();
    } catch (EmptySaleException e) {
      System.out.println(e.getMessage());
    }

  }

}
