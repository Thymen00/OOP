package lab2.UML;

public class Person {    
    private String firstName;
    private String lastName;

    // public Person(String firstName, String lastName){
        
    //     this.firstName=firstName;
    //     this.lastName=lastName;
    // }

    public void setfirstName(String firstName){
        this.firstName=firstName;
    }
    public void setlastName(String lastName){
        this.lastName=lastName;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
}
