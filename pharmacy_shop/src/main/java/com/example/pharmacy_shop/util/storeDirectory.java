package com.example.pharmacy_shop.util;

import java.util.ArrayList;

public class StoreDirectory {

    ArrayList<Store> storeList;

    public StoreDirectory(){
        this.storeList = new ArrayList<>();
    }

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Store> storeList) {
        this.storeList = storeList;
    }

    public Store addStore(Store store){
        //Store store = new Store();
        storeList.add(store);
        return store;
    }
    public void removeStore(Store store){
        storeList.remove(store);
    }

}
