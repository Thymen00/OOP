package lab1;

    //attributes
public class Book {
    private String title; //verbergt data, alleen methoden binnen deze classen kunnen erbij
    private String author;  //verbergt data, alleen methoden binnen deze classen kunnen erbij
    private double price; //overal toegankelijk

    //constructor
    public Book(String title, String author, double price){             //het aanroepen van de constructer, maakt een nieuw -book- object
         this.title=title;                                              //Een parameter is een variabele die je meegeeft aan een methode of constructor.
         this.author=author;
         this.price=price;
    }

    //methodes/functies
    public void setTitle(String title){         // doordat het public is kan het overal worden aangeroepen en doordat het setter-METHODE is kan je later de -titel- veranderen
        this.title=title;                       //Voert de toekenning binnen de setter uit.
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){         
        this.price=price;
    }   
    public String getTitle(){       //door getter kan je Hiermee buitenstaanders de titel opvragen (zonder direct veldtoegang).
        return title;               //geeft de waarde van -title- terug
    }
    public String getAuthor(){
        return author;
    }


}

//Price is in deze klasse public dus eigenlijk is deze setter overbodig  maar hij is handig als je later validatie wilt toevoegen (bijv. prijs niet negatief). dit was als de price ook public was maar dat is niet meer het geval