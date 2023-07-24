package com.example.pharmacyapp.Controllers;

import java.sql.Date;

public class medicineData {

    private int medicineId;
    private String brand;
    private String productName;
    private String type;
    private String status;
    private Double price;
    private Date date;
    private String image;


    public medicineData(int medicineId,String brand,String productName,String type,String status, Double price,String image, Date date){
        this.medicineId = medicineId;
        this.brand = brand;
        this.productName = productName;
        this.type = type;
        this.status = status;
        this.price = price;
        this.date = date;
        this.image = image;

    }

    public int getMedicineId(){
        return medicineId;
    }

    public String getBrand() {
        return brand;
    }

    public String getProductName() {
        return productName;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public Double getPrice() {
        return price;
    }

    public String getImage(){
        return image;
    }

    public Date getDate() {
        return date;
    }
}
