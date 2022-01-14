import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.ResponseBody;
import com.sun.org.apache.xalan.internal.xsltc.dom.MultiDOM;

import java.io.IOException;
import java.util.List;


public class RequestSender {

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String API_KEY = "t2cVAklY2TNAPLX9JqSyftAywCDLXTws";
    

    static public <getList> String sendCityIdRequest(String cityName) throws IOException {
        String cityId = null;
        

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("q", cityName)
                .build();

        @JsonIgnoreProperties(ignoreUnknown = true)
        class Response {
            List<Weather> list;

            public ResponseBody body() {
                return null;
            }

            //general getters and setters
        }

        byte[] jsonStr;
        @JsonIgnoreProperties(ignoreUnknown = true)
        class Weather<cityId> {
            JsonNode main;
            JsonNode wind;

            @JsonProperty("dt_txt")
            String dtTxt;

            ObjectMapper mapper = new ObjectMapper();
            Response response = mapper.readValue(jsonStr, Response.class);

            String givenDate = "2019-11-21 12:00:00";
            response.List().

            void forEach('e' -> {
                MultiDOM e;
                if (givenDate.equals(e.getDtTxt())) {
                    System.out.println("temp: " + e.getMain().get("temp").asText());
                    System.out.println("wind speed:" + e.getWind().get("speed").asText());
                }
            });

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();


        String responseJson = response.body().string();


        JsonNode cityIdNode = objectMapper
                .readTree(responseJson)
                .at("/0/Key");

            Weather() throws IOException {
            }

            
       
    }

        String cityId1 = cityId;
        static public String sendTempRequest(String Object wind;
        Object wind1 = wind;) {
        return null;
    }


}
