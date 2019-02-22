package me.geeksploit.enot.storage;

import me.geeksploit.enot.customer.Customer;

public class Storage {
    private static final int CAPACITY = 3;

    public static Customer[] customers = new Customer[CAPACITY];
}
