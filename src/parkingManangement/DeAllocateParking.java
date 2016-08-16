package parkingManangement;

import memberManagement.models.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by sheebanshaikh on 8/9/16.
 */

public class DeAllocateParking implements ParkingAllocation {

    int slotsNumber = 0;
    String vehicleId;
    Vehicle vehicle;
    @PersistenceContext
    private EntityManager entityManager;

    //returning allocated slot for vehicles
    public Integer getSlotNumber() {

        return 2;
    }

    //returning vehicle name
    public String getVehicle() {

        return "Mercedes - C";
    }

    public void allocationRequest() {
        System.out.println("========Removing the parking slot=========");
        System.out.println("Vehicle Id: " + getVehicle() + " has been removed from slot -" + getSlotNumber());
    }
}
