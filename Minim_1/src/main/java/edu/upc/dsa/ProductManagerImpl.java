package edu.upc.dsa;

import edu.upc.dsa.models.*;
import org.apache.log4j.Logger;

import java.util.*;

public class ProductManagerImpl implements ProductManager{
    private static ProductManager instance;
    Map<String, User> users;
    Queue<Order> orders;
    List<Product> products;

    final static Logger logger = Logger.getLogger(ProductManagerImpl.class);

    public static ProductManager getInstance() {
        if (instance==null) instance = new ProductManagerImpl();
        return instance;
    }
    public ProductManagerImpl(){
        this.users = new HashMap<>();
        this.orders = new LinkedList<Order>();
        this.products = new ArrayList<>();

    }
    public List<Product> productsByPrice(){
        logger.info("getProductsByPrice()");
        products.sort((Product p1, Product p2)->(Double.compare(p1.getPrice(),p2.getPrice())));
        return products;
    }

    public List<Product> productsBySales(){
        logger.info("getProductsBySales()");
        products.sort((Product p1, Product p2)->(p1.getNumSales()- p2.getNumSales()));
        return products;
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public Order processOrder(){

        Order o1=this.orders.poll();
        pollOrders(o1);
        return o1;
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        return users.get(userId).getOrderList();
    }

    @Override
    public void addUser(String s, String name, String surname) {
        User u =new User(s, name, surname);
        users.put(s,u);
    }

    @Override
    public void addProduct(String productId, String name, double price) {
        Product p =new Product(productId, name, price);
        products.add(p);

    }

    @Override
    public Product getProduct(String productId) {
        for (Product p: products)
        {
            if(p.getProductId()==productId)
                return p;
        }
        return null;
    }

    @Override
    public int numUsers() {
        return users.size();
    }

    @Override
    public int numProducts() {
        return products.size();
    }

    @Override
    public int numOrders() {
        return orders.size();
    }

    @Override
    public int numSales(String b001) {
        for (Product p: products)
        {
            if(p.getProductId()==b001)
                return p.getNumSales();
        }
        return 0;
    }

    public void pollOrders(Order o){
        User u=this.users.get(o.getId());
        u.addOrder(o);
        for (LP lp: o.getLPlist()){
            for (Product p: products)
            {
                if(Objects.equals(lp.getProduct(), p.getProductId())) {
                    p.addSales(lp.getQuantity());
                    //p.getNumSales()
                    break;
                }
            }
        }
    }

}
