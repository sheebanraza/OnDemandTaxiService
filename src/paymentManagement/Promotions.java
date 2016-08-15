package paymentManagement;

import static paymentManagement.CardPay.MIN_DISTANCE;

/**
 * Created by sheebanshaikh on 8/10/16.
 */
public class Promotions implements Payment {

    private static final double PROMO_AMT = 2;
    private double amount;

    @Override
    public double generateBill(Long distance) {
        if (distance <= MIN_DISTANCE) {
            amount -= PROMO_AMT;
        } else {
            amount = (distance * 0.56) - PROMO_AMT;
        }
        return amount;
        //remain amt debit/credit
    }
}
