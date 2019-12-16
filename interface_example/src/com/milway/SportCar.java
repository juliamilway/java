package com.milway;

public class SportCar extends Vehicle implements Speedable{
    private String brandOfNitro;

    public SportCar(String model, int maxSpeed, double price, String brandOfNitro) {
        super(model, maxSpeed, price);
        this.brandOfNitro = brandOfNitro;
    }

    public String getBrandOfNitro() {
        return brandOfNitro;
    }

    public void setBrandOfNitro(String brandOfNitro) {
        this.brandOfNitro = brandOfNitro;
    }

    @Override
    public String toString() {
        return "com.milway.SportCar{" +
                "brandOfNitro='" + brandOfNitro + '\'' +
                "} " + super.toString();
    }

    @Override
    public void addSpeed(int kmHr) {
        int speed=getMaxSpeed()+kmHr;
        setMaxSpeed(speed);
    }
}
