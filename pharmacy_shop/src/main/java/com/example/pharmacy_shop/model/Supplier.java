package com.example.pharmacy_shop.model;

public class Supplier {
    private String supplierCode;
    private String name;
    private String location;
    private String contactInfo;

    publicSupplier(String supplierCode, String name, String location, String contactInfo) {
        this.supplierCode = supplierCode;
        this.name = name;
        this.location = location;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Additional methods for manipulating supplier data
    // ...
}
