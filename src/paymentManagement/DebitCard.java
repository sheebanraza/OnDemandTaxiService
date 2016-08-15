package paymentManagement;

import memberManagement.service.Member;

/**
 * Created by sheebanshaikh on 8/10/16.
 */


public class DebitCard extends CardPay {

    private Double amount;

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

    public DebitCard(Payment newPayment,double dis) {
        super(newPayment);
        System.out.println("Paying through debit");
        processTransaction(dis);
    }


    @Override
    public double generateBill() {
        System.out.println("Debit transaction cost: "+ 0);
        System.out.println("Fair on Distance traveled: "+ amount);
        return tempPayment.generateBill()+ amount;

    }
}
