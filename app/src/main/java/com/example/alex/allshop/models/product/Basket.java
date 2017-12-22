package com.example.alex.allshop.models.product;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private static Basket instance;
    private static List<Product> products;

    private Basket(){
        if (products==null)
        products=new ArrayList<>();
    }

    public static Basket getInstance(){
        if (instance==null){
            instance=new Basket();
        }
        return instance;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
}
