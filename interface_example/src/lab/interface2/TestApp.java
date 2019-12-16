package lab.interface2;

public class TestApp {
   public static void main(String[] args) {

    MyCalculator calc= new MyCalculator();

        System.out.println("Result of division = "+calc.division(50,10));
        System.out.println("Result of subtraction = "+calc.minus(5,2));
        System.out.println("Result of multiply = "+calc.multiply(7,2));
        System.out.println("Result of sum = "+calc.plus(5,5));
    }
}
