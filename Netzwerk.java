import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

class Netzwerk
{
  

    public static String post(String nachricht, String adresse)
    {
        String erg = null;
        try {
            URL url = new URL(adresse);  

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");

            con.setDoOutput(true);
            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
            out.write(nachricht);
            out.close();

            String readStream = readStream(con.getInputStream());
            // Give output for the command line
            System.out.println(readStream);
            erg = readStream;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return erg;
    }

    public static String get(String adresse){  
        String erg = "";
        try {
            URL url = new URL(adresse);                      

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            String readStream = readStream(con.getInputStream());
            // Give output for the command line
            System.out.println(readStream);
            erg = readStream;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return erg;
    }

    private static String readStream(InputStream in) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {

            String nextLine = "";
            while ((nextLine = reader.readLine()) != null) {
                sb.append(nextLine);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}

