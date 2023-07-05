package com.example.pharmacy_shop.model;

public class Customer {
    private String customerCode;
    private String name;
    private String address;
    private String contactInfo;

    public Customer(String customerCode, String name, String address, String contactInfo) {
        this.customerCode = customerCode;
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Additional methods for manipulating customer data
    // Implement additional methods here based on your requirements

    public void placeOrder() {
        // Implement the logic for placing an order by the customer
    }

    public void updateAddress(String newAddress) {
        // Implement the logic for updating the customer's address
    }

    public void updateContactInfo(String newContactInfo) {
        // Implement the logic for updating the customer's contact information
    }

    // ... Implement more methods as needed

}
