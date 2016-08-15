package rideManagement;

import java.util.Map;

/**
 * Created by sheebanshaikh on 8/9/16.
 */
public class ProcessRide implements RideState {
    @Override
    public void request_type(String request_type) {

    }

    @Override
    public boolean receiveRequest(Map<String, String> sourceVsDestinationMap, int vehicleType) {
        return true;
    }

    @Override
    public boolean qualifyRequest(Map<String, String> sourceVsDestinationMap, int vehicleType) {
        if (!sourceVsDestinationMap.equals(null)) {
            int i = 19;
            System.out.println("Ride processing for " + sourceVsDestinationMap.keySet().size() + " ride...");
            if (sourceVsDestinationMap.keySet().size() > 1) {
                for (String source : sourceVsDestinationMap.keySet()) {
                    System.out.println("Ride processing for \n Source: " + source + "\nDestination: " + sourceVsDestinationMap.get(source)
                            + "\n Date : " + i + "-Aug-2016");
                }

            }
        }
        return true;
    }

    @Override
    public boolean approveRequest(Map<String, String> sourceVsDestinationMap, int vehicleType) {
        return false;
        //Driver available
        //
    }
}
