package routingManagement;

import static java.lang.Math.*;

/**
 * Created by sheebanshaikh on 8/9/16.
 */


public class TaxiX {

    //Haversine Formula for Calculating Path
    public Double calculatePath(Long sourceLatitute, Long sourceLongitutde, Long destLatitude, Long destLongtitude) {
        Double earthRadius = 3958.75;
        Double latRadians = toRadians(destLatitude - sourceLatitute);
        Double lngRadians = toRadians(destLongtitude - sourceLatitute);
        Double sindLat = sin(latRadians / 2);
        Double sindLng = sin(lngRadians / 2);
        Double a = pow(sindLat, 2) + pow(sindLng, 2) * cos(toRadians(sourceLatitute)) * cos(toRadians(destLatitude));
        double c = 2 * atan2(sqrt(a), sqrt(1 - a));
        double dist = earthRadius * c;
        return dist;
    }
}
