package Salary;

public class WagesMain {
    public static void main(String [] args){

       HourlyRate hourlyRate = new HourlyRate(3, 10);

       MonthlyRate monthlyRate = new MonthlyRate(30, 26);

        System.out.println("Employee's wage per day is: "+hourlyRate.count()+" $");
        System.out.println("Employee's wage per month is: "+monthlyRate.count()+" $");
    }
}
