package com.milway;

import java.util.StringJoiner;

public class MiddleClass extends GeneralCars {
    private static int count=0;

    public MiddleClass (){
        count++;
    }

    public MiddleClass(String carBrand, int carPrice, double carFuel, int carSpeed) {
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
