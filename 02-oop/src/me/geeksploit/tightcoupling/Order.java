package me.geeksploit.tightcoupling;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Order {

  private static final Set<Order> ORDERS = new HashSet<>();

  private final Set<Country> countries = new HashSet<>();
  private final Set<City> cities = new HashSet<>();

  private Customer customer;
  private int price;

  public Order(Customer customer, int price, City... cities) {
    this.customer = customer;
    this.price = price;
    for (City c : cities) {
      countries.add(c.getCountry());
    }
    cities.addAll(Arrays.asList(cities));
    ORDERS.add(this);
  }

  static Order[] getAll() {
    return ORDERS.toArray(new Order[0]);
  }

  @Override
  public String toString() {
    return String.format("Order #%d by %s\nvisiting %s\nin %s\nTOTAL: $%d", hashCode(), customer, cities, countries, price);
  }
}
