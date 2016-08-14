package routingManagement;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by sheebanshaikh on 8/9/16.
 */
public class TaxiXL {

    //Calculation Using Google Distance Matrix API
    OkHttpClient okHttpClient = new OkHttpClient();

    Request request = new Request.Builder().
            url("https://maps.googleapis.com/maps/api/distancematrix/" +
                    "json?units=imperial&origins=Washington,DC&destinations=New+York+City,NY&key=").build();
    Response response = okHttpClient.newCall(request).execute();


    public TaxiXL() throws IOException {
    }
}
