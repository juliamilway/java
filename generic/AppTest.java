package lesson17_12;

public class AppTest {
	public static void main(String[] args) {
    Integer [] mas1=new Integer[] {1,2,5,6,7};
    Double [] mas2=new Double[] {0.2,8.0,9.8};
    printMasiv(mas1);
    printMasiv(mas2);
		
	}
	static <T> void printMasiv(T [] mas) {
		for(T element: mas) {
			System.out.println(element);
		}
		
		
	}

}
