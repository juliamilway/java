package lpr18_4;

public class Methods {
	private double a;
	private double b;
	
	public Methods() {
		this.a = 0;
		this.b = 0;
	}
	public Methods(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double plus(double a, double b){
		test_except(a,b);
		return a + b;
	}

	public double minus(double a, double b) {
		test_except(a,b);
		return a - b;
	}

	public double myltiply(double a, double b) {
		test_except(a,b);
		return a * b;
	}

	public double divosion(double a, double b) {
		test_except(a,b);
		return a / b;
	}

	public void test_except(double a, double b) {
		try {
			if (a < 0 && b < 0) {
				String message = "Error " + a + "<0 and " + b + "<0";
				throw new IllegalArgumentException(message);
			}
			if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
				String message = "Error (" + a + "==0 and " + b + "!=0) or" + a + "!=0 and " + b + "==0";
				throw new ArithmeticException(message);
			}
			if (a == 0 && b == 0) {
				String message = "Error (" + a + "==0 and " + b + "==0)";
				throw new IllegalAccessException(message);
			}
			if (a > 0 && b > 0) {
				// String message="Error ("+a+">0 and "+b+">0)";
				throw new MyException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
