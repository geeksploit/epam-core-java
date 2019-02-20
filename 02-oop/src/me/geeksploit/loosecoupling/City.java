package me.geeksploit.loosecoupling;

public class City {

  private String name;
  private int population;
  private boolean isCapital;

  public City(String name, int population) {
    this.name = name;
    this.population = population;
  }

  @Override
  public String toString() {
    return name;
  }
}
