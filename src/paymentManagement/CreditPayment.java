package paymentManagement;


/**
 * Created by sheebanshaikh on 8/10/16.
 */

public class CreditPayment extends CardPay {

    private double amount;

    public CreditPayment(Payment newPayment, double dis) {
        super(newPayment);
        System.out.println("Paying through Credit");
        processTransaction(dis);
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
    public double generateBill(Long distance) {
        System.out.println("Credit transaction cost:   "+ 0.1);
        System.out.println("Fair on Distance traveled: "+ amount);
        return tempPayment.generateBill(distance) + amount + 0.1;

    }
}