import java.util.TimerTask;

public class MyTimerTask extends TimerTask
{
    Bot bot;
    
    public MyTimerTask(Bot bot_)
    {
        bot = bot_;
    }

    @Override
    public void run()
    {
        bot.nachrichtSenden();
    }
    
}
