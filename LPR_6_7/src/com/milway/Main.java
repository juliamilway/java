package com.milway;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int number=2;
    Product [] products=new Product[number];
    products[0]=new Product( 1, "Slime_studio", "SAM", 2.0, 2.0, 50 );
    products[1]=new Product(2, "Slime_fluff", "MAS", 3.0, 3.0, 100);
//	products[0];
	show(products);
    filter(products);

    }

    public static void show (Product [] products){
        for (int i=0; i<products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public static void filter (Product []products) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name=in.next();
        System.out.println("Enter the manufacture name: ");
        String manufacture=in.next();
        System.out.println("Enter price value (double type):");
        double price=in.nextDouble();

        for (Product element:products) {
            if (name.equals(element.getName()))
            element.toString();
            if (manufacture.equals(element.getManufacture()))
                element.toString();
            if (price>element.getPrice())
                element.toString();
            else {
                System.out.println("This product not exist");
            }

        }
    }
}
