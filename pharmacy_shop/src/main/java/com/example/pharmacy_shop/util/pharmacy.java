package com.example.pharmacy_shop.util;
public class Pharmacy {

    private String pharmaName;
    private int pharmaID;
    private String pharmaLocation;
    private DrugCatalog drugCatalog;

    @Override
    public String toString() {
        //return "Pharmacy{" + "pharmaName=" + pharmaName + '}';
        return pharmaName;
    }

    public Pharmacy(){
        drugCatalog = new DrugCatalog();
    }
    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }

    public String getStoreName() {
        return pharmaName;
    }

    public void setStoreName(String storeName) {
        this.pharmaName = storeName;
    }

    public int getStoreID() {
        return pharmaID;
    }

    public void setStoreID(int storeID) {
        this.pharmaID = storeID;
    }

    public String getStoreLocation() {
        return pharmaLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.pharmaLocation = storeLocation;
    }


}
