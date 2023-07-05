package com.example.pharmacy_shop.controller;

import com.example.pharmacy_shop.model.Drug;
import com.example.pharmacy_shop.model.PurchaseHistory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PurchaseHistoryController {
    private List<PurchaseHistory> purchaseHistoryList;

    public PurchaseHistoryController() {
        this.purchaseHistoryList = new ArrayList<>();
    }

    public void addPurchaseHistory(PurchaseHistory purchaseHistory) {
        purchaseHistoryList.add(purchaseHistory);
    }

    public List<PurchaseHistory> getPurchaseHistoryList() {
        return purchaseHistoryList;
    }

    public List<PurchaseHistory> getSortedPurchaseHistoryByDate() {
        List<PurchaseHistory> sortedList = new ArrayList<>(purchaseHistoryList);
        sortedList.sort(Comparator.comparing(PurchaseHistory::getPurchaseDate).thenComparing(PurchaseHistory::getPurchaseTime));
        return sortedList;
    }

    public List<PurchaseHistory> getSortedPurchaseHistoryByAmount() {
        List<PurchaseHistory> sortedList = new ArrayList<>(purchaseHistoryList);
        sortedList.sort(Comparator.comparing(PurchaseHistory::getTotalAmount));
        return sortedList;
    }

    // Additional methods for purchase history-related functionality
    // ...
}
