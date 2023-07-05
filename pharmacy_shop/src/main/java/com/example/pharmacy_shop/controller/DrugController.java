package com.example.pharmacy_shop.controller;

import com.example.pharmacy_shop.model.Drug;
import java.util.ArrayList;
import java.util.List;

public class DrugController {
    private List<Drug> drugs;

    public DrugController() {
        this.drugs = new ArrayList<>();
    }

    public void addDrug(Drug drug) {
        drugs.add(drug);
    }

    public void removeDrug(Drug drug) {
        drugs.remove(drug);
    }

    public Drug searchDrug(String drugCode) {
        for (Drug drug : drugs) {
            if (drug.getDrugCode().equals(drugCode)) {
                return drug;
            }
        }
        return null;
    }

    public List<Drug> getAllDrugs() {
        return drugs;
    }

    // Additional methods for drug-related functionality
    // ...
}
