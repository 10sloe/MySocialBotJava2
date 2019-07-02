// Bot erweitert die Klasse User

public class Bot extends User
{

    // Konstruktor
    Bot() 
    {
        super("Bot");
    }

    // Methoden
    void nachrichtSenden()
    {
        // verwendet eine Methode der Oberklasse
        nachrichtSenden("Super!","Die Sonne scheint");
    }

}

