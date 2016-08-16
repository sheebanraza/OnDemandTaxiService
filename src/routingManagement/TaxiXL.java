package routingManagement;

import com.google.common.collect.Lists;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * Created by sheebanshaikh on 8/9/16.
 */
public class TaxiXL implements ProcessRouting {

    //Calculation Using Google Distance Matrix API

    @Override
    public List<Double> processRoutes(Map<String, String> sourceVsDestination) throws Exception {
        HttpClient httpClient = new DefaultHttpClient();
        List<Double> distances = Lists.newArrayList(10.0, 14.7, 16.75);
        HttpGet httpGet =
                new HttpGet("https://maps.googleapis.com/maps/api/distancematrix/\" +\n" +
                        "                    \"json?units=imperial&origins=Washington,DC&destinations=New+York+City,NY&key=");
        HttpResponse httpResponse = httpClient.execute(httpGet);

        int statusCode = httpResponse.getStatusLine().getStatusCode();

        String mainJsonString = String.valueOf(httpResponse.getEntity().getContent());

        JSONObject jsonObjectOfDistance = new JSONObject(mainJsonString);
        if (statusCode == 200) {
            JSONArray jsonArray = jsonObjectOfDistance.getJSONArray("distance");

        }
        return distances;
    }
}
