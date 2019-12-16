package com.milway;

public class TestMain {
    public static void main(String [] args){
        Ferrari f348=new Ferrari("f348", 300, 1000000, "Nitro");
        System.out.println (f348+"  "+f348.getBrandOfNitro());

        Truck rom=new Truck("Rom", 20, 18000, 21000, 22);
        System.out.println("Truck's price is: " +rom.getPrice());
        rom.setPrice(45000);
        System.out.println("Truck's length is: "+rom.getPrice());

        System.out.println("Truck's price is: "+rom.getLength());
        rom.setLength(45);
        System.out.println("Truck's length is: "+rom.getLength());

        Vehicle car=new Truck("Chevy", 50, 50000, 22000, 45);
        System.out.println(car);

        System.out.println("Truck's max speed is: "+rom.getMaxSpeed());
    }
}
