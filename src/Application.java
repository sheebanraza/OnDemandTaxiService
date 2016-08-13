import memberManagement.models.MemberDetails;
import memberManagement.models.MemberType;
import memberManagement.service.Customer;
import memberManagement.service.Driver;
import memberManagement.service.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.util.*;

/**
 * Created by sheebanshaikh on 8/12/16.
 */


public class Application {

    public static void main(String args[]) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        b: do
        {
            System.out.println("======================= Online Taxi Booking ======================");
            System.out.println("1)Sign up\n2)Sign In\n3)Exit");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Choice: ");
            int ch = s.nextInt();

            switch (ch)
            {
                case 1:System.out.println("Sign Up here");
                    System.out.println("Enter Your first name: ");
                    String name = s.next();
                    System.out.println("Enter your Email ID: ");
                    String email = s.next();
                    System.out.println("Enter password: ");
                    String pass = s.next();
                    System.out.println("Confirm Password");
                    String C_pass = s.next();
                    System.out.println("Enter your Type: 1. Customer, \n \t 2. Driver ");
                    String type = s.next();
                    Member member;
                    if(type.equals("1")) {
                         member = applicationContext.getBean(Customer.class);
                         member.addOrUpdateMember(new MemberDetails(name,email,pass, MemberType.CUSTOMER));
                    }else{
                         member = applicationContext.getBean(Driver.class);
                         member.addOrUpdateMember(new MemberDetails(name,email,pass, MemberType.Driver));
                    }

                    break;   // Sign Up

                case 2:System.out.println(" ===== Sign In =====");
                    System.out.println("Enter your Email ID: ");
                    String S_email = s.next();
                    System.out.println("Enter password: ");
                    String S_pass = s.next();
                    System.out.println("==========Signed In =======");
                    do
                    {
                        System.out.println("1)View Details\n"
                                + "2)Update Details\n"
                                + "3)Delete Deails\n"
                                + "4)Request Ride\n"
                                + "5)Cancel Ride\n"
                                + "6)View Due balance\n"
                                + "7)Generate Receipt\n"
                                + "8)Sign out");
                        System.out.println("Enter Your Choice");
                        int ch1 =s.nextInt();
                        switch(ch1)
                        {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8: continue b;
                        }
                    } while(true);

                case 3: return;


            }

        }while(true);
    }


    }



