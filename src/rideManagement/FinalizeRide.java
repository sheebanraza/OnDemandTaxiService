package rideManagement;

/**
 * Created by sheebanshaikh on 8/9/16.
 */
public class FinalizeRide implements RideState {
    @Override
    public void request_type(String request_type) {

    }

    @Override
    public boolean receiveRequest(String source, String destination, int vehicleType) {
        return false;
    }

    @Override
    public boolean qualifyRequest(String source, String destination, int vehicleType) {
        return false;
    }

    @Override
    public boolean approveRequest(String source, String destination, int vehicleType) {
        return false;
    }
}
