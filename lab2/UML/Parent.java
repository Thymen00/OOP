package lab2.UML;

public class Parent extends Person{
    private Child child;
    private int money;

    public Parent(int money){
        this.money=money;
    }

    public Child getChild(){
        return child;
    }
    public void setChild(Child child){
        this.child=child;
    }
}
