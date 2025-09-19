package lab1;

public class BookDemo {
    public static void main(String [] args){
        Book a = new Book("Developing Java Software", "Ruseel Winderand", 79.75); //roept constructer aan die in -Book.java- werdt gegeven, hierdoor bestaat er door dit een -book- object met titel, auteur en prijs.
        System.out.println(a.getTitle()); // haalt het uit de -book- klasse en print het uit, het bestaat dus al doordat de constructor al is opgeroepen
        System.out.println(a.getAuthor());
    }
   
    
}
