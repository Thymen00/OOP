import java.util.Scanner;

public class hello{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("Enter name: ");
        name = scan.nextLine();
    }
}


//Attributes

// Dat zijn de eigenschappen van een object (bv. een auto heeft een kleur, merk, en aantal deuren).

// Constructor

// De constructor is een speciale functie die automatisch wordt aangeroepen als je een object maakt.

// In encapsulation maak je je attributen private → dat betekent dat andere classes ze niet rechtstreeks kunnen aanpassen of lezen.

// Om dat tóch mogelijk te maken, schrijf je getters (om te lezen) en setters (om te schrijven/veranderen).

// Je kunt in een setter ook extra regels/voorwaarden toevoegen (zoals bij het salaris: "alleen updaten als het > 0").