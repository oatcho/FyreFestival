package com.company;

import java.util.Scanner;

import java.util.ArrayList;

public class AdminServices {

    private ArrayList<Admin> admins = new ArrayList<>();

    public void addAdmins(){
    admins.add(new Admin("oatcho", "gumDrops"));
    Admin christie = new Admin("Destroyer", "band30geek");
    admins.add(christie);
    }

    public void printAdmins(){
        for (Admin adminList: admins) {
            System.out.println(adminList);
        }
    }

    public void adminCredCheck(AttendeeListService aListServ) {
        Scanner ser = new Scanner(System.in);
        String usernameInput;
        String passwordInput;
        System.out.println("Please enter your username:");
        usernameInput = ser.nextLine();
        System.out.println("Please enter your password:");
        passwordInput = ser.nextLine();
        boolean userFound = false;
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getName().equalsIgnoreCase(usernameInput) && admins.get(i).getPassword().equals(passwordInput)) {
                userFound = true;
                System.out.println("Billy welcomes to the Fyre Festival Admin Menu");
                System.out.println("What do you want to do next? \n 1) View All Registrations \n 2) Guest Search and Registration Update \n 3) Return to Main Menu");
                int searchMenuOption = ser.nextInt();
                            switch (searchMenuOption) {
                                case 1:
                                    System.out.println("Would you like to see all registrants, or search by state?\n 1) See All Registrants \n 2) Search Registrants by State");
                                    int numInput = ser.nextInt();
                                    if(numInput==1) {
                                    aListServ.printDetails();}
                                    else if (numInput==2){
                                    System.out.println("Search By State:");
                                    ser.nextLine();
                                    String state = ser.nextLine();
                                    aListServ.searchByState(state);}
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    return;
                                default:
                                    break;
                            }
                }
            }


        if (!userFound) {
            System.out.println("Invalid Credentials, go see Billy.");
        }
    }
}
