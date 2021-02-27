package NewProject.BusinessLayer;

import java.util.Scanner;

public class Login {
    client Client ;


    public client getLoginDetails(int signingUp){

        Scanner sc = new Scanner(System.in);
        int choice;

        switch (signingUp) {
            case 1: 
            Client.getClientInformation();
                
                break;
            case 2: 
            System.out.println("Please Choose one of the following events");
            System.out.println("==========================================");
            System.out.println("--Birthday Parties \n --Weddings \n --Funerals");
                choice = Integer.parseInt(sc.nextLine());
                
            default:
                break;
        }






        return Client;
    }

}
