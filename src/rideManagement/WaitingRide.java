package rideManagement;

import java.util.Map;

/**
 * Created by sheebanshaikh on 8/9/16.
 */
public class WaitingRide implements RideState {


    @Override
    public void request_type(String request_type) {

    }

    @Override
    public boolean receiveRequest(Map<String, String> sourceVsDestinationMap, int vehicleType) {
        if (!sourceVsDestinationMap.equals(null)) {
            System.out.println("Request Initiated for " + sourceVsDestinationMap.keySet().size() + " ride...");
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public boolean qualifyRequest(Map<String, String> sourceVsDestinationMap, int vehicleType) {
        return false;
    }

    @Override
    public boolean approveRequest(Map<String, String> sourceVsDestinationMap, int vehicleType) {
        return false;
    }
}
