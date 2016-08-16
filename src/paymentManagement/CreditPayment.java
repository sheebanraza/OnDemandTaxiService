package paymentManagement;


/**
 * Created by sheebanshaikh on 8/10/16.
 */

public class CreditPayment extends CardPay {

    private double amount;

    public CreditPayment(double dis) {
        super();
        System.out.println("Paying through Credit");
        generateBill(dis);
    }

    @Override
    public void processTransaction(double distance) {
        if (distance<=MIN_DISTANCE){
            amount=0;
        }
        else {
            amount=distance*0.56;
        }
    }

    @Override
    public void cancelTransaction() {

    }

    @Override
    public double generateBill(Double distance) {
        processTransaction(distance);
        System.out.println("Credit transaction cost:   "+ 0.1);
        System.out.println("Fair on Distance traveled: "+ amount);
        return getBaseFare() + amount + 0.1;
    }
}