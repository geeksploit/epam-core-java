package me.geeksploit.enot.customer;

public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
