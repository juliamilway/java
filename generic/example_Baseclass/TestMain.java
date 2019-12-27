package lesson17_12.example_Baseclass;

public class TestMain {
	public static void main(String[] args) {
		Student student1=new Student("Igor",23,"SSS");
		Student student3=student1;
		Student student2=new Student("Igor",23, "RRRR");
		System.out.println(student1.equals(student2));
		if (student1.equals(student2)) {
			System.out.println("True");}
		else {System.out.println("False");}
	}
}
