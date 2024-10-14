package exercise1_1;

import java.util.ArrayList;

public class Sale {
  private ArrayList<Product> products;
  private double totalPurchase;

  // Constructor
  public Sale() {
    this.products = new ArrayList<Product>();
    this.totalPurchase = 0.0;
  }

  // getters
  public ArrayList<Product> getProducts() {
    return this.products;
  }

  public double getTotalPurchase() {
    return totalPurchase;
  }

  // setters
  public void setProducts(ArrayList<Product> products) {
    this.setProducts(products);
  }

  public void setTotalPurchase(double totalPurchase) {
    this.totalPurchase = totalPurchase;
  }

  // Method to calculate the total of the sale
  public double calcTotal() throws EmptySaleException {
    if (this.products.isEmpty()) {
      throw new EmptySaleException("Para hacer una venta primero debes añadir productos");
    }

    totalPurchase = 0.0;
    for (Product product : products) {
      totalPurchase += product.getPrice();
    }

    setTotalPurchase(totalPurchase);

    System.out.println("Total de la venta: " + totalPurchase);

    return totalPurchase;
  }

  // Method to add a product to the sale
  public void addProduct(Product product) {
    products.add(product);
  }

}
