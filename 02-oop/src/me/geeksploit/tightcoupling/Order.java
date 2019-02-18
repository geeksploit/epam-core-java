package me.geeksploit.tightcoupling;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Order {

  private static final Set<Order> ORDERS = new HashSet<>();

  private final Set<Country> COUNTRIES = new HashSet<>();
  private final Set<City> CITIES = new HashSet<>();

  private Customer customer;
  private int price;

  public Order(Customer customer, int price, City... cities) {
    this.customer = customer;
    this.price = price;
    for (City c : cities) {
      COUNTRIES.add(c.getCountry());
    }
    CITIES.addAll(Arrays.asList(cities));
    ORDERS.add(this);
  }

  static Order[] getAll() {
    return ORDERS.toArray(new Order[0]);
  }

  @Override
  public String toString() {
    return String.format("Order #%d by %s\nvisiting %s\nin %s\nTOTAL: $%d", hashCode(), customer, CITIES, COUNTRIES, price);
  }
}
