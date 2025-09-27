package lab2.UML;

public class Main {
    public static void main(String[]args){
        Mother m = new Mother();
        m.setfirstName("Alice");
        System.out.println(m.getfirstName()); 
        Father f = new Father(m);
        f.setfirstName("Bob");
        System.out.println(f.getfirstName()); 
        Person p = new Person();
        p.setfirstName("John");
        System.out.println(p.getfirstName()); 
    }
}
