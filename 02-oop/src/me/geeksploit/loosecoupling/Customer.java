package me.geeksploit.loosecoupling;

public class Customer {

  private String firstName;
  private String lastName;
  private String passport;

  public Customer(String firstName, String lastName, String passport) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.passport = passport;
  }

  @Override
  public String toString() {
    return String.format("%s %s", firstName, lastName);
  }
}
