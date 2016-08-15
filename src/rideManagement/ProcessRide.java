package rideManagement;

/**
 * Created by sheebanshaikh on 8/9/16.
 */
public class ProcessRide implements RideState {
    @Override
    public void request_type(String request_type) {

    }

    @Override
    public boolean receiveRequest(String source, String destination, int vehicleType) {
        if (!(source.equals(null) || destination.equals(null))) {

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean qualifyRequest(String source, String destination, int vehicleType) {
        //book taxi

        return false;
    }

    @Override
    public boolean approveRequest(String source, String destination, int vehicleType) {
        return false;
        //Driver available
        //
    }
}
