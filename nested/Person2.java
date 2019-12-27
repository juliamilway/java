package nested_inner.nested;

class Person2{
 
private String name;

Person2(String name){
    this.name = name;
}

public void setAccount (String password){
    
    class Account{
      
        void display(){
            System.out.printf("Account Login: %s \t Password: %s \n", name, password);
        }
    }
    Account account = new Account();
    account.display();
}

}
