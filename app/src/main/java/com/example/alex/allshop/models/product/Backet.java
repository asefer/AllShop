package com.example.alex.allshop.models.product;

import java.util.ArrayList;
import java.util.List;

public class Backet {

    private static Backet instance;
    private static List<Product> products;

    private  Backet(){
        if (products==null)
        products=new ArrayList<>();
    }

    public static Backet getInstance(){
        if (instance==null){
            instance=new Backet();
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
