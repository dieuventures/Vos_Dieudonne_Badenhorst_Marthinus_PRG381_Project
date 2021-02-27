package NewProject.PresentLayer;

import java.util.*;

import NewProject.BusinessLayer.Login;



public  class mainView {
    
public static void main(String[] args) {
    Login logs = new Login();
    int cChoices;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to the event planner for Rachel's Company");

    System.out.println("Do you wish to open an account with us");

    System.out.println("1. Open an account \n 2. events we offer at Rachels's");
    cChoices = Integer.parseInt(sc.nextLine());

    sc.close();
}
    
}
