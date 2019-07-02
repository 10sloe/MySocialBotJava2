import java.util.TimerTask;

public class MyTimerTask extends TimerTask
{
    // Mein Bot
    Bot bot;
    
    public MyTimerTask(Bot bot_)
    {
        bot = bot_;
    }

    // Die Aufgabe des Timertasks
    // Wird der Timer mit diesem Task gestartet, wird immer die Methode run 
    // ausgeführt
    @Override
    public void run()
    {
        bot.nachrichtSenden();
    }
    
}
