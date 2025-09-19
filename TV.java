import java.util.Scanner;

public class TV {
    public int channel;
    public int brightness;
    public int gamma;
    public String name;
    

    public TV(){
        channel =1;
        brightness = 50;
        gamma = 2;
        name = "";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TV a = new TV();
        System.out.print("Enter name: ");
        a.name = scan.nextLine();
        System.out.println("TV Name: "+a.name);
        scan.close();
        
    }


}
