package Salary;

public class MonthlyRate implements Wagesable {
    double dailyPay;
    double days;

    MonthlyRate (double days, double dailyPay){
        this.days=days;
        this.dailyPay=dailyPay;
    }

    @Override
    public double count() {
        return dailyPay*days;
    }
}
