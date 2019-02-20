package me.geeksploit.loosecoupling;

public class Main {

  public static void main(String[] args) {

    TravelAgency moonshineAgency = new TravelAgency();

    Country usa = new Country("USA", "English");
    Country japan = new Country("Japan", "Japanese");

    City newYork = new City("New York", 8_623);
    City losAngeles = new City("Los Angeles", 4_000);
    City tokyo = new City("Tokyo", 9_273);
    City osaka = new City("Osaka", 2_691);

    moonshineAgency.updateWorld(newYork, usa);
    moonshineAgency.updateWorld(losAngeles, usa);
    moonshineAgency.updateWorld(tokyo, japan);
    moonshineAgency.updateWorld(osaka, japan);

    Customer johnDoe = new Customer("John", "Doe", "1234567890");
    Customer yokoNarayana = new Customer("Yoko", "Narayana", "234567890");
    Customer janeEyre = new Customer("Jane", "Eyre", "345678901");

    moonshineAgency.addOrder(new Order(5_894), johnDoe, newYork);
    moonshineAgency.addOrder(new Order(3_451), johnDoe, losAngeles);
    moonshineAgency.addOrder(new Order(11_235), yokoNarayana, tokyo, osaka);
    moonshineAgency.addOrder(new Order(5_816), janeEyre, newYork, losAngeles, tokyo, osaka);

    System.out.println(moonshineAgency.printOrders());
  }
}
