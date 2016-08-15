package rideManagement;

import paymentManagement.CreditPayment;
import paymentManagement.Payment;
import paymentManagement.Promotions;

/**
 * Created by sheebanshaikh on 8/9/16.
 */
public class FinalizeRide {
    double dis =9;
    Payment pay=new CreditPayment(new Promotions(),dis);
            System.out.println("Total Trip Charge:   "+pay.generateBill());
}
