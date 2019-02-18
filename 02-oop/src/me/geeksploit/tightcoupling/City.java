package me.geeksploit.tightcoupling;

import java.util.HashSet;
import java.util.Set;

public class City {

  private static final Set<City> CITIES = new HashSet<>();

  private String name;
  private int population;
  private boolean isCapital;
  private Country country;

  public City(String name, int population, Country country) {
    this.name = name;
    this.population = population;
    this.country = country;
    CITIES.add(this);
  }

  public Country getCountry() {
    return country;
  }

}
