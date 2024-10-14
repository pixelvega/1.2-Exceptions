package exercise1_1;

public class Product {
  private String name;
  private double price;

  // Constructor
  public Product(String name, double price) {
    this.name = name;
    this.price = price;

  }

  // getters
  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}
