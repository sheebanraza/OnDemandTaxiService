import rideManagement.FinalizeRide;
import rideManagement.ProcessRide;
import rideManagement.WaitingRide;

import java.util.Scanner;

/**
 * Created by sheebanshaikh on 8/12/16.
 */


public class Application {

    public static void main(String args[]) {

        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        WaitingRide  Wait_obj = new WaitingRide();
        ProcessRide  proc_Req = new ProcessRide();
        FinalizeRide final_req = new FinalizeRide();

        Scanner s = new Scanner(System.in);
        b: do
        {
            int ch = mainMenu();
            switch (ch)
            {
                case 1:
                    signupMenu(s);
                    break;   // Sign Up

                case 2:
                    signInMenu(s);
                    c:do
                    {
                        int ch1 = bookRideUpdateMenu();

                        switch (ch1)
                                {
                                    case 1:
                                        sourceAndDestinationMenu();
                                        continue c;

                                    case 2:
                                        updateDetailsMenu();
                                        break;

                                    case 3:// continue b;

                                }
                                break;

                    } while(true);

                case 3: return;


            }

        }while(true);


    }

    private static int bookRideUpdateMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Book a Ride\n"
                +"2)Update Details\n"
                + "3)Sign Out"
        );
        System.out.println("Enter Your Choice");
        return scanner.nextInt();
    }

    private static int mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================= Online Taxi Booking ======================");
        System.out.println("1)Sign up\n2)Sign In\n3)Exit");
        System.out.println("Enter the Choice: ");
        return scanner.nextInt();
    }

    private static void signInMenu(Scanner s) {
        System.out.println(" ===== Sign In =====");
        System.out.println("Enter your Email ID: ");
        String S_email = s.next();
        System.out.println("Enter password: ");
        String S_pass = s.next();
        System.out.println("==========Signed In =======");
    }

    private static void signupMenu(Scanner s) {
        System.out.println("Sign Up here");
        System.out.println(" ========== Personal Details ===========");
        System.out.println("Enter Your first name: ");
        String name = s.next();
        System.out.println("Enter your Email ID: ");
        String email = s.next();
        System.out.println("Enter password: ");
        String pass = s.next();
        System.out.println("Confirm Password");
        String C_pass = s.next();
        System.out.println(" ========== Card Details ===========");
        System.out.println("Enter the Card type [Credit/Debit]: ");
        String card_type = s.next();
        System.out.println("Enter Your card Number: ");
        int card_num = s.nextInt();
        System.out.println("Enter the Expiration Date ");
        String Exp_date =  s.next();
    }

    private static void updateDetailsMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your new password: ");
        String curr_pw = scanner.next();
        System.out.println("Confirm your new password: ");
        String con_pass = scanner.next();
        System.out.println("Enter the Card type: "
                + "1)Credit\n"
                + "2)Debit");
        String card_type_up = scanner.next();
        System.out.println("Enter Your card Number: ");
        int card_num_up = scanner.nextInt();
        System.out.println("Enter the Expiration Date ");
        String Exp_date_up = scanner.next();
    }

    private static void sourceAndDestinationMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Source Address: ");
        String source = scanner.next();
        System.out.println("Enter the destination Address");
        String destination = scanner.next();
    }


}



