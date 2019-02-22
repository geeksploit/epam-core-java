package me.geeksploit.enot.customer.repo;

import me.geeksploit.enot.customer.Customer;

import static me.geeksploit.enot.storage.Storage.customers;

public class CustomerMemoryRepo {
    private int customerIndex = -1;

    public void addCustomer(Customer newCustomer) {
        if (customerIndex == customers.length - 1) {
            Customer[] newCustomersArray = new Customer[customers.length * 2];
            System.arraycopy(customers, 0, newCustomersArray, 0, customers.length);
            customers = newCustomersArray;
        }

        customerIndex++;
        customers[customerIndex] = newCustomer;
    }
}
