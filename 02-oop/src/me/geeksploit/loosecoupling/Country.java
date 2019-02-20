package me.geeksploit.loosecoupling;

public class Country {

  private String name;
  private String language;

  public Country(String name, String language) {
    this.name = name;
    this.language = language;
  }

  @Override
  public String toString() {
    return name;
  }
}
