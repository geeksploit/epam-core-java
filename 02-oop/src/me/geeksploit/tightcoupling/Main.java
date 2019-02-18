package me.geeksploit.tightcoupling;

public class Main {

  public static void main(String[] args) {

    Country usa = new Country("USA", "English");
    Country japan = new Country("Japan", "Japanese");

    City newYork = new City("New York", 8_623, usa);
    City losAngeles = new City("Los Angeles", 4_000, usa);
    City tokyo = new City("Tokyo", 9_273, japan);
    City osaka = new City("Osaka", 2_691, japan);

    Customer johnDoe = new Customer("John", "Doe", "1234567890");
    Customer yokoNarayana = new Customer("Yoko", "Narayana", "234567890");
    Customer janeEyre = new Customer("Jane", "Eyre", "345678901");

    new Order(johnDoe, 5_894, newYork);
    new Order(johnDoe, 3_451, losAngeles);
    new Order(yokoNarayana, 11_235, tokyo, osaka);
    new Order(janeEyre, 5_816, newYork, losAngeles, tokyo, osaka);
  }
}
