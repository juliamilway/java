package lesson17_12.example_Baseclass;

public class Student {
	String name;
	private int age;
	private String surname;
	
	public Student(String name, int age, String surname) {
		this.name = name;
		this.age = age;
		this.surname = surname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	public boolean equals(Student student2) {
		if (this==student2) 
			return true;
		
		if (!name.equals(student2.name)) return false;
		if (!surname.equals(student2.surname)) return false;
		if (age!=student2.age) return false;
				
		return true;
	} 
	
	
	

	
	
}
