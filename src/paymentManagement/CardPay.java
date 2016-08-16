package paymentManagement;

/**
 * Created by sheebanshaikh on 8/10/16.
 */


public abstract class CardPay implements Payment{

    public static final double MIN_DISTANCE = 6;

    protected Payment tempPayment;


    public CardPay(Payment newPayment){

        tempPayment = newPayment;

    }

    public CardPay() {
    }

    public abstract void processTransaction(double distance);

    public abstract void cancelTransaction();

    public double getBaseFare() {
        return tempPayment.BASE_FARE;
    }

}
