package paymentManagement;

import memberManagement.service.Member;

/**
 * Created by sheebanshaikh on 8/10/16.
 */


public abstract class CardPay {

    public abstract void processTransaction(Member member, Float distance);

    public abstract void cancelTransaction();


}
