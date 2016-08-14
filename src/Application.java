import memberManagement.models.MemberDetails;
import memberManagement.models.MemberType;
import memberManagement.service.Customer;
import memberManagement.service.Driver;
import memberManagement.service.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import rideManagement.FinalizeRide;
import rideManagement.ProcessRide;
import rideManagement.WaitingRide;
import routingManagement.ProcessRouting;

import java.util.*;

/**
 * Created by sheebanshaikh on 8/12/16.
 */


public class Application {

    public static void main(String args[]) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        WaitingRide  Wait_obj = new WaitingRide();
        ProcessRide  proc_Req = new ProcessRide();
        FinalizeRide final_req = new FinalizeRide();

        Scanner s = new Scanner(System.in);
        b: do
        {
            int ch = mainMenu(s);
            switch (ch)
            {
                case 1:
                    signupMenu(s);
                    break;   // Sign Up

                case 2:
                    signInMenu(s);
                    c:do
                    {
                        int ch1 = bookRideUpdateMenu(s);
                        switch(ch1)
                        {
                            case 1:  System.out.println("1)Book a Ride\n"+"2)Update Details\n"+"3)Sign out");
                                System.out.println("Enter Your Choice");
                                Scanner sc =new Scanner(System.in);
                                int ch2= sc.nextInt();
                                System.out.println(ch2);
                                switch(ch2)
                                {
                                    case 1:
                                        sourceAndDestinationMenu(sc);
                                        continue c;

                                    case 2:
                                        updateDetailsMenu(sc);
                                        break;

                                    case 3: continue b;

                                }
                                break;


                            case 3: continue b;

                        }
                    } while(true);

                case 3: return;


            }

        }while(true);


    }

    private static int bookRideUpdateMenu(Scanner s) {
        System.out.println("1)Book a Ride\n"
                +"2)Update Details\n"
                + "3)Sign Out"
        );
        System.out.println("Enter Your Choice");
        return s.nextInt();
    }

    private static int mainMenu(Scanner s) {
        System.out.println("======================= Online Taxi Booking ======================");
        System.out.println("1)Sign up\n2)Sign In\n3)Exit");
        System.out.println("Enter the Choice: ");
        return s.nextInt();
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

    private static void updateDetailsMenu(Scanner sc) {
        System.out.println("Enter your new password: ");
        String curr_pw = sc.next();
        System.out.println("Confirm your new password: ");
        String con_pass =sc.next();
        System.out.println("Enter the Card type: "
                + "1)Credit\n"
                + "2)Debit");
        String card_type_up = sc.next();
        System.out.println("Enter Your card Number: ");
        int card_num_up = sc.nextInt();
        System.out.println("Enter the Expiration Date ");
        String Exp_date_up =  sc.next();
    }

    private static void sourceAndDestinationMenu(Scanner sc) {
        System.out.println("Enter the Source Address: ");
        String source = sc.next();
        System.out.println("Enter the destination Address");
        String destination= sc.next();
    }


}



