package Salary;

public class HourlyRate implements Wagesable {
double moneyRate;
double hour;

    HourlyRate (double moneyRate, double hour){
     this.moneyRate=moneyRate;
     this.hour=hour;
}

    @Override
    public double count() {
        return moneyRate*hour;

    }
}
