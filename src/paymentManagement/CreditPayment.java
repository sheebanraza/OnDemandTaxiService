package paymentManagement;


/**
 * Created by sheebanshaikh on 8/10/16.
 */

public class CreditPayment extends CardPay {

    private double amount;

    public CreditPayment(double dis) {
        super();
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
        System.out.println("\n-------------Ride Receipt---------------");
        System.out.println("Paying through Credit");
        System.out.println("Distance Travelled       : " + distance);
        System.out.println("Base Fare                : " + getBaseFare());
        System.out.println("Amount                   : " + amount);
        System.out.println("Credit transaction cost  : " + 0.1);
        System.out.println("--------------------------------------");
        Double total = getBaseFare() + (Math.round(amount * 100.0) / 100.0) + 0.1;
        System.out.println("      Total              : " + total);
        System.out.println("--------------------------------------");
        return getBaseFare() + amount + 0.1;
    }
}