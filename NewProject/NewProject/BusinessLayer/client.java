package NewProject.BusinessLayer;

import java.util.*;

public class client {
    void getClientInformation(){
        String CName;
        String CSurname;
        String CEmailAddress;
        String CCellNum;

        Scanner sc = new Scanner(System.in);   // Setting scanner up to read client input

        System.out.println("Can you please enter your name for reference?");
        CName = sc.nextLine();

        System.out.println("Can you please enter your surname?");
        CSurname = sc.nextLine();

        System.out.println("Can you please enter your email address?");
        CEmailAddress = sc.nextLine();

        System.out.println("Can you Please enter your number if we need to contact you");
        CCellNum = sc.nextLine();

        sc.close();   // Closing the scanner that reads the data entered by the client  into the variables
    }
}
