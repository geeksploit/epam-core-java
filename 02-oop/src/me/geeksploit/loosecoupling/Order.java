package me.geeksploit.loosecoupling;

public class Order {

  private int price;

  public Order(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("Order #%d TOTAL: $%d", hashCode(), price);
  }

  public int getPrice() {
    return price;
  }
}
