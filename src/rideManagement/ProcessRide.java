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

            for (int ik = 0; ik < 5; ik++) {
                System.out.print(". ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (sourceVsDestinationMap.keySet().size() >= 1) {
                System.out.println("\n\n----------- Ride processing for -----------");
                for (String source : sourceVsDestinationMap.keySet()) {
                    System.out.println("Source      : " + source + "\nDestination : " + sourceVsDestinationMap.get(source)
                            + "\nDate        : " + i++ + "-Aug-2016");
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
