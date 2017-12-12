package com.example.alex.allshop.models.product;

/**
 * Created by alex on 12.12.17.
 */

public class Product {
    private String name;
    private int price;
    private String specification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}
