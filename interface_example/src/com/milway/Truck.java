package com.milway;

public class Truck extends Vehicle implements Speedable{
    private double maxLoad;
    private double length;

    public Truck(String model, int maxSpeed, double price, double maxLoad, double length) {
        super(model, maxSpeed, price);
        this.maxLoad = maxLoad;
        this.length = length;
    }

    @Override
    public String toString() {
        return "com.milway.Truck{" +
                "maxLoad=" + maxLoad +
                ", length=" + length +
                "} " + super.toString();
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public void addSpeed(int kmHr) {
    int speed=getMaxSpeed()+kmHr;
    setMaxSpeed(speed);
    }
}
