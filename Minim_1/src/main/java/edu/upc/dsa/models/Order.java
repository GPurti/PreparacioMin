package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
    String id;
    List<LP> lp;

    public Order(String id) {
        this.id = id;
        this.lp = new LinkedList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<LP> getLPlist() {
        return lp;
    }

    public void setLPlist(LinkedList<LP> lp) {
        this.lp = lp;
    }

    public void addLP(int i, String b001) {

        LP l = new LP(i, b001);
        this.lp.add(l);
    }

    public LP getLP(int i) {
        return lp.get(i);
    }
}
