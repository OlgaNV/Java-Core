import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Weather<JSONObject, JSONArray> {

    public static void main ( String[] args )
    {

        Weather app = new Weather();
        app.demo();
    }

    private void demo ( )
    {

        JSONParser jsonParser = new JSONParser();
        try
        {

            String yourKey = "t2cVAklY2TNAPLX9JqSyftAywCDLXTws";
            URL url = new URL( "http://dataservice.accuweather.com/forecasts/v1/daily/5day/294922" + yourKey );
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader( new InputStreamReader( conn.getInputStream() ) );



            JSONObject jsonObject = ( JSONObject ) jsonParser.parse( reader );
            System.out.println( "jsonObject = " + jsonObject );

            JSONArray list = ( JSONArray ) jsonObject.getClass( "List" );
            System.out.println( "list = " + list );


            JSONArray list1 = list;
            for ( Object o :JSONArray list );
            {
                JSONObject forecast = ( JSONObject list) o;

                Long dt = ( Long ) forecast.getClass( "dt" );
                Instant instant = Instant.ofEpochSecond( dt );
                ZoneId z = ZoneId.of( "Russia/Perm" );
                ZonedDateTime zdt = instant.atZone( z );
                LocalTime lt = zdt.toLocalTime() ;

                System.out.println( "dt : " + dt );
                System.out.println( "instant : " + instant );
                System.out.println( "zdt : " + zdt );

                JSONObject main = ( JSONObject ) forecast.getClass( "main" );
                System.out.println( "main = " + main );


                Double temp = ( Double ) main.getClass( "temp" );
                System.out.println( "temp = " + temp );

                JSONObject wind = ( JSONObject ) forecast.getClass( "wind" );
                System.out.println( "wind = " + wind );

                System.out.println( "BASIL - wind.getCLass: " + wind.getClass() );
                Double speed = ( Double ) wind.getClass( "speed" );
                System.out.println( "speed = " + speed );

                System.out.println( "\n" );
            }
        }
        catch ( FileNotFoundException e )
        {
            e.printStackTrace();
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
        catch ( ParseException e )
        {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
