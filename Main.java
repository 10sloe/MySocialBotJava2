
import java.util.Timer;

public class Main
{
    // Attribute
    Timer timer;
    MyTimerTask task;

    Main(){
        // Erstellt einen neuen Bot
        Bot bot = new Bot(); 

        // Erstellt einen Auftrag für den Timer
        task = new MyTimerTask(bot); 

        
    }
    void start()
    {
        // Erstelle einen Timer
        timer = new Timer(true);
        // Startet die wiederholte Ausführung des Auftrags
        // Beginnt gleich
        // Führt die Aufgabe alle 5 Sekunden aus!
        timer.scheduleAtFixedRate(task,0,5000);

    }

    void stop()
    {
        // Stoppt die Ausführung des Timers
        timer.cancel();
    }

}
