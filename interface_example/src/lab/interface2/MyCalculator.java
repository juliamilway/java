package lab.interface2;

import lab.interface1.Numberable;

public class MyCalculator implements Numberable {
    @Override
    public double division(double first, double second) {

        return first/second;
    }

    @Override
    public double minus(double first, double second) {
        return first-second;
    }

    @Override
    public double multiply(double first, double second) {
        return first*second;
    }

    @Override
    public double plus(double first, double second) {
        return first+second;
    }

}
