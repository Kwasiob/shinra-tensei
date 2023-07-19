
package com.example.pharmacy_shop.util;

import java.util.ArrayList;

public class MasterOrderCatalog {
    private ArrayList<Order> orderCatalog;

    public MasterOrderCatalog(){
        orderCatalog = new ArrayList<Order>();
    }

    public Order addOrder(Order o){

        orderCatalog.add(o);
        return o;
    }

    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<Order> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }

}
