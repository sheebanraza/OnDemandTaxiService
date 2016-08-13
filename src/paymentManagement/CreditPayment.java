package paymentManagement;


import memberManagement.service.Member;

/**
 * Created by sheebanshaikh on 8/10/16.
 */

public class CreditPayment extends CardPay {

    @Override
    public void processTransaction(Member member, Float distance) {

    }

    @Override
    public void cancelTransaction() {

    }
}
