package me.geeksploit.loosecoupling;

import java.util.*;

public class TravelAgency {

  private static final Map<City, Country> WORLD_MAP = new HashMap<>();

  private final Map<Order, Customer> orderHasCustomer = new HashMap<>();
  private final Map<Order, Set<City>> orderHasCity = new HashMap<>();

  public void updateWorld(City city, Country country) {
    WORLD_MAP.put(city, country);
  }

  public void addOrder(Order order, Customer customer, City... cities) {
    orderHasCustomer.put(order, customer);
    addCity(order, cities);
  }

  public Customer getCustomer(Order order) {
    return orderHasCustomer.get(order);
  }

  public City[] getCities(Order order) {
    return orderHasCity.get(order).toArray(new City[0]);
  }

  public Country[] getCountries(Order order) {
    Set<Country> countries = new HashSet<>();
    for (City city : getCities(order)) {
      countries.add(WORLD_MAP.get(city));
    }
    return countries.toArray(new Country[0]);
  }

  public String printOrders() {
    StringBuilder sb = new StringBuilder();
    for (Order o : getOrders()) {
      sb.append(String.format("Order #%d by %s\nvisiting %s\nin %s\nTOTAL: $%d",
          o.hashCode(), getCustomer(o), getCities(o), getCountries(o), o.getPrice()));
    }
    return sb.toString();
  }

  private void addCity(Order order, City... cities) {
    if (orderHasCity.containsKey(order)) {
      orderHasCity.get(order).addAll(Arrays.asList(cities));
    } else {
      orderHasCity.put(order, new HashSet<>(Arrays.asList(cities)));
    }
  }

  private Order[] getOrders() {
    return orderHasCustomer.keySet().toArray(new Order[0]);
  }
}
