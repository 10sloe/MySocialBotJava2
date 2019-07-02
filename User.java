
import org.json.*;
public class User
{
    // Attribute
    // Name des Benutzers
    String name;
    // Adresse der Seite 
    // API steht für application programming interface
    String API_URL = "https://sabsloe-mysocialbot-1.glitch.me/api";

    // Konstruktor
    User(String name_)
    {
        name = name_;
    }

    // Methoden
    public void nachrichtSenden(String stimmung, String grund)
    {
        Nachricht nachricht = new Nachricht(name, stimmung, grund);
        String nachrichtJSon = nachricht.toJson();
        String erg =  Netzwerk.post(nachrichtJSon, API_URL); 
        System.out.println(erg);
    }

    public void alleNachrichten()
    {
        String ergebnis = Netzwerk.get(API_URL); 
        System.out.println("-----Alle Nachrichten: ---- ");
        try{
            JSONArray array = new JSONArray(ergebnis);
            for (int i = 0; i < array.length(); i++) {
                JSONObject row = array.getJSONObject(i);
                String name = row.getString("name");
                String stimmung = row.getString("stimmung");
                String grund = row.getString("grund");
                Nachricht n = new Nachricht(name, stimmung, grund);
                n.ausgeben();
                System.out.println();

            }
        }catch(Exception ex)
        {}

    }

}