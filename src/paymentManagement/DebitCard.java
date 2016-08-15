package paymentManagement;

/**
 * Created by sheebanshaikh on 8/10/16.
 */


public class DebitCard extends CardPay {

    private Double amount;

    public DebitCard(Payment newPayment, Double dis) {
        super(newPayment);
        System.out.println("Paying through debit");

    }

    @Override
    public void processTransaction(double distance) {
        if (distance<= MIN_DISTANCE){
             amount = Double.valueOf(0);
        }
        else {
            amount=distance * 0.56;
        }
    }

    @Override
    public void cancelTransaction() {

    }

    @Override
    public double generateBill(Long distance) {
        processTransaction(distance);
        System.out.println("Debit transaction cost: "+ 0);
        System.out.println("Fair on Distance traveled: "+ amount);
        return getBaseFare() + amount;
    }
}
