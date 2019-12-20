package com.milway;

public /*abstract*/ class GeneralCars {
    private String carBrand;
    private int carPrice;
    private double carFuel;
    private int carSpeed;

    public GeneralCars(){}

    public GeneralCars(String carBrand, int carPrice, double carFuel, int carSpeed) {
        this.carBrand = carBrand;
        this.carPrice = carPrice;
        this.carFuel = carFuel;
        this.carSpeed = carSpeed;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public double getCarFuel() {
        return carFuel;
    }

    public void setCarFuel(double carFuel) {
        this.carFuel = carFuel;
    }
    public int getCarSpeed () {
      return this.carSpeed = carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return "Car brand is: "+getCarBrand()+"Car price is: "+getCarPrice()+"Car fuel is: "+getCarFuel();
    }

}
