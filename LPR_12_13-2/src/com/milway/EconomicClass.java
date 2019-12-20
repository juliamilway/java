package com.milway;

public class EconomicClass extends GeneralCars {
    private static int count=0;

    public EconomicClass() {
        count++;
    }

    public EconomicClass(String carBrand, int carPrice, double carFuel, int carSpeed) {
        super(carBrand, carPrice, carFuel,carSpeed);
        count++;
    }

    public  int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
