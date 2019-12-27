package nested_inner.nested;

public class TestMain {
	  
		public static void main(String[] args) {
		         
		    Person person1 = new Person("Kate", "password");
		    person1.displayPerson();
		    person1.account.displayAccount();
		    Person2 person2 = new Person2("Ihor");
	        person2.setAccount("password");
		}
		
}
