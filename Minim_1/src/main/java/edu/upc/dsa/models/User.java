package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

import java.util.*;


public class User {
    String name;
    String surname;
    String id;

    List<Order> orderList;


    public User(){}
    public User(String id, String name, String surname) {
        this();
        this.id=id;
        this.name = name;
        this.surname = surname;
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Order order){
        orderList.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
