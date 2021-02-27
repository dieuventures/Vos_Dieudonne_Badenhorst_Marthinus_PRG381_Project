package NewProject.BusinessLayer;

import java.util.Scanner;

public class Funerals implements events {
    
    String eventType = "Funerals";
    String cStarters;
    String cMain;
    String cDessert;
    int numOfPeople;
    String eventThemes;
    String eventAddress;
    String dateTime;

    @Override public void getEventInformation(){

        Scanner sc = new Scanner(System.in);  // Setting the scanner for reading the clients answers

        // getting the information from the client for the event
        System.out.println("Please enter the number of people");
        numOfPeople = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter the Theme of the Funeral");
        eventThemes = sc.nextLine();

        System.out.println("Please enter the address for the Funeral");
        eventAddress = sc.nextLine();

        System.out.println("Please enter the date and the time of the Funeral");
        dateTime = sc.nextLine();

        // this is where the menu choices will be for the client
        System.out.println("===========================Menu options==========================");
        

        System.out.println("Would you like a starter? If Yes What shall it be?");
        cStarters = sc.nextLine();

        System.out.println("Would you like a Main Course? If Yes What shall it be?");
        cMain = sc.nextLine();

        System.out.println("Would you like a Dessert? If Yes What shall it be?");
        cDessert = sc.nextLine();

        sc.close(); // Closing the scanner for the client information

    }

}
