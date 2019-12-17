package com.milway;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Product {
    private int id;
    private String name;
    private String manufacture;
    private double price;
    private double valid;
    private double quantity;

    public Product(){

    }

    public Product(int id, String name, String manufacture, double price, double valid, double quantity) {
        this.id=id;
        this.name=name;
        this.manufacture=manufacture;
        this.price=price;
        this.valid=valid;
        this.quantity=quantity;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getManufacture() {
        return manufacture;
    }
    public double getPrice() {
        return price;
    }
    public double getValid() {
        return valid;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setId(int id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setValid(double valid) {
        this.valid = valid;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return "Product name is: "+getId()+" Product name is: "+getName()+" Product manufacture is: "+getManufacture()+
                " Product price is: "+getPrice()+"\nProduct valid to: "+getValid()+" Product quantity is: "+getQuantity();
    }
    public void display() {
        System.out.println("Product name is: "+id+" Product name is: "+name+" Product manufacture is: "+manufacture+
                " Product price is: "+price+"\nProduct valid to: "+valid+" Product quantity is: "+quantity);
    }
}
