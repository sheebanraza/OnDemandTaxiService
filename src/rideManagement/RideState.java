package rideManagement;

/**
 * Created by sheebanshaikh on 8/9/16.
 */
public interface RideState {

    public void request_type(String request_type);

    public boolean receiveRequest(String source, String destination, int vehicleType);

    public boolean qualifyRequest(String source, String destination, int vehicleType);

    public boolean approveRequest(String source, String destination, int vehicleType);
}
