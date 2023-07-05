package com.example.pharmacy_shop.controller;

import com.example.pharmacy_shop.model.Drug;
import com.example.pharmacy_shop.model.Supplier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SupplierController {
    private Map<Drug, List<Supplier>> drugSupplierMap;

    public SupplierController() {
        this.drugSupplierMap = new HashMap<>();
    }

    public void linkDrugToSupplier(Drug drug, Supplier supplier) {
        List<Supplier> suppliers = drugSupplierMap.getOrDefault(drug, new ArrayList<>());
        suppliers.add(supplier);
        drugSupplierMap.put(drug, suppliers);
    }

    public List<Supplier> searchSuppliersByDrug(Drug drug) {
        return drugSupplierMap.getOrDefault(drug, new ArrayList<>());
    }

    public List<Supplier> searchSuppliersByDrugAndLocation(Drug drug, String location) {
        return drugSupplierMap.getOrDefault(drug, new ArrayList<>()).stream()
                .filter(supplier -> supplier.getLocation().equals(location))
                .collect(Collectors.toList());
    }

    // Additional methods for supplier-related functionality
    // ...
}
