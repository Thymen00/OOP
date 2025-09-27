package lab2.UML;

public class Mother extends Parent{
    private Father husband;

    public Mother(){
        super(0);
    }

    @Override
    public String getfirstName(){
        return "Mrs." + super.getfirstName();
    }
}
