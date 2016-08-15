package paymentManagement;

import memberManagement.service.Member;

import static paymentManagement.CardPay.MIN_DISTANCE;

/**
 * Created by sheebanshaikh on 8/10/16.
 */
public class Promotions implements Payment {


    @Override
    public double generateBill() {

        return 4.7;


    }
}
