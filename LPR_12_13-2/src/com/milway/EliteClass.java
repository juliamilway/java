package com.milway;

public class EliteClass extends GeneralCars {
    private static int count=0;

    public EliteClass (){
        count++;
    }

    public EliteClass(String carBrand, int carPrice, double carFuel, int carSpeed) {
        super(carBrand, carPrice, carFuel, carSpeed);
        count++;

    }

    public int getCount() {
        return count;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
