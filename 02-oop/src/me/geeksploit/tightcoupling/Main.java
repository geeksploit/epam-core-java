package me.geeksploit.tightcoupling;

public class Main {

  public static void main(String[] args) {

    Country usa = new Country("USA", "English");
    Country japan = new Country("Japan", "Japanese");

    City newYork = new City("New York", 8_623, usa);
    City losAngeles = new City("Los Angeles", 4_000, usa);
    City tokyo = new City("Tokyo", 9_273, japan);
    City osaka = new City("Osaka", 2_691, japan);
  }
}
