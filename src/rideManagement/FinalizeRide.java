package rideManagement;

import java.util.Map;

/**
 * Created by sheebanshaikh on 8/9/16.
 */
public class FinalizeRide implements RideState {


    @Override
    public void request_type(String request_type) {

    }

    @Override
    public boolean receiveRequest(Map<String, String> sourceVsDestinationMap, int vehicleType) {
        return false;
    }

    @Override
    public boolean qualifyRequest(Map<String, String> sourceVsDestinationMap, int vehicleType) {
        return false;
    }

    @Override
    public boolean approveRequest(Map<String, String> sourceVsDestinationMap, int vehicleType) {
        int i = 19;
        if (sourceVsDestinationMap.keySet().size() > 1) {
            for (String source : sourceVsDestinationMap.keySet())
                System.out.println("Ride scheduled : \n Source: " + source + "\nDestination: " + sourceVsDestinationMap.get(source)
                        + "\n Date : " + i + "-Aug-2016");
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

}
