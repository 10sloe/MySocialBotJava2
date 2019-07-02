import org.json.*;
public class Nachricht
{
    String name;
    String stimmung; 
    String grund;

    Nachricht ()
    {}

    Nachricht(String name_, String stimmung_, String grund_)
    {
        name = name_;
        stimmung = stimmung_;
        grund = grund_;
    }

    void ausgeben()
    {
        System.out.println("****** Nachricht *****");
        System.out.println("Name: " + name);
        System.out.println("Stimmung: " + stimmung);
        System.out.println("Grund: " + grund);
    }

    String toJson()
    {
        String erg = null;
        try{
            JSONObject jo = new JSONObject();
            jo.put("name", name);
            jo.put("stimmung", stimmung);
            jo.put("grund", grund);
            erg = jo.toString();
        }catch(Exception ex)
        {}

        return erg;
    }

    
}
