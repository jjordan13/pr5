package com.example.pr5;
public class Product {
    private String name, unit; private int count = 0;
    public Product(String name, String unit) { this.name=name; this.unit=unit; }
    public String getName() { return name; }
    public int getCount() { return count; }
    public void setCount(int c) { count=c; }
    public String getUnit() { return unit; }
}