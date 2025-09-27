package lab1.Book;

public class BookDemo {
    public static void main(String [] args){
        Book a = new Book("Developing Java Software", "Ruseel Winderand", 79.75); //roept constructer aan die in -Book.java- werdt gegeven, hierdoor bestaat er door dit een -book- object met titel, auteur en prijs.
        // a.setTitle("Harry potter"); als je de titel wilt veranderen
        System.out.println(a.getTitle()); // haalt het uit de -book- klasse en print het uit, het bestaat dus al doordat de constructor al is opgeroepen
        System.out.println(a.getAuthor());
    }
   
    
}



//class is het object
// dan beschrijf je de kenmerken van het object prive of publiekelijk
// dan moet je aanroepen zodat het een constructer wordt.
//daarna heb je methodes/functies
//this. is het roepen en/of refereren naar het object



// Wat doet this?

// Stel je hebt een boek.
// Een boek heeft een titel die erin opgeslagen zit.
// Wanneer je zegt:

// public void setTitle(String title) {
//     this.title = title;
// }


// Het rechterstuk title = wat je meeneemt van buiten (“de nieuwe titel die je geeft”).

// Het linkerstuk this.title = het plekje binnenin het boek zelf waar de titel wordt bewaard.

// 👉 Dus je zegt letterlijk:

// “Stop de titel die ik van jou krijg in de titel van dit boek.”

// Voorbeeld in gewoon Nederlands

// Stel jij bent een doos 📦 met een etiket “titel” erop.

// Als iemand je zegt: “Hier, nieuw etiket: Harry Potter”

// Dan pak jij dat etiket en plak je het op jezelf.

// Dat plak-moment is this.title = title;

// this.title = het etiket dat op de doos zit.

// title = het papiertje dat iemand je van buiten geeft.

// Zonder this (stel je voor)

// Als je this. weglaat, zou de computer in de war raken:

// “Bedoel je het etiket op de doos?”

// “Of bedoel je het papiertje dat je net gaf?”

// Met this. zeg je: het gaat om het etiket op de doos (dit object zelf).

// Wil je dat ik een heel mini-programma maak waar je ziet wat er gebeurt als je this weghaalt, zodat je snapt waarom het nodig is?