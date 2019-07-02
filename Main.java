
import java.util.Timer;

public class Main
{
    public static void main(String[] args){
        Bot bot = new Bot(); 
        MyTimerTask task = new MyTimerTask(bot); 
        
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(task,0,5000);
        
        
    }
}
