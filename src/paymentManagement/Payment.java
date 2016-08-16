package paymentManagement;

/**
 * Created by sheebanshaikh on 8/9/16.
 */


public interface Payment {

    public static final Double BASE_FARE = 5.41;

    public double generateBill(Double distance);

}
