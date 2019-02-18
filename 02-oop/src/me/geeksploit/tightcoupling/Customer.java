package me.geeksploit.tightcoupling;

import java.util.HashSet;
import java.util.Set;

public class Customer {

  private static final Set<Customer> CUSTOMERS = new HashSet<>();

  private String firstName;
  private String lastName;
  private String passport;

  public Customer(String firstName, String lastName, String passport) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.passport = passport;
    CUSTOMERS.add(this);
  }

}
