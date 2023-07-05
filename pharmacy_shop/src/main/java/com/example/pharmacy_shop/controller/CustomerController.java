package com.example.pharmacy_shop.controller;

import com.example.pharmacy_shop.model.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerController {
    private Map<String, Customer> customers;

    public CustomerController() {
        this.customers = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerCode(), customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer.getCustomerCode());
    }

    public Customer searchCustomer(String customerCode) {
        return customers.get(customerCode);
    }

    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customers.values());
    }

    // Additional methods for customer-related functionality
    // ...

    public void updateCustomerAddress(String customerCode, String newAddress) {
        Customer customer = customers.get(customerCode);
        if (customer != null) {
            customer.setAddress(newAddress);
        }
    }

    public void updateCustomerContactInfo(String customerCode, String newContactInfo) {
        Customer customer = customers.get(customerCode);
        if (customer != null) {
            customer.setContactInfo(newContactInfo);
        }
    }

    // ...
}
