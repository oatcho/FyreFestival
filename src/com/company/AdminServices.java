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

    public void adminCredCheck() {
        Scanner ser = new Scanner(System.in);
        String usernameInput;
        String passwordInput;
        System.out.println("Please enter your username:");
        usernameInput = ser.nextLine();
        System.out.println("Please enter your password:");
        passwordInput = ser.nextLine();
        boolean bookFound = false;
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getName().equalsIgnoreCase(usernameInput) && admins.get(i).getPassword().equals(passwordInput)) {
                bookFound = true;
                System.out.println("What do you want to do next? \n 1) Edit Book Info \n 2) Borrow (Delete) Book \n 3) Return to Main Menu");
                int searchMenuOption = ser.nextInt();
                while (searchMenuOption != 3) {
                            System.out.println("What part of the book would you like to edit?");
                            System.out.println("\n1) Edit title \n 2) Edit author \n 3) Edit publisher \n 4) Edit number of pages \n 5) Exit");
                            int inputEditOption = ser.nextInt();
                            switch (inputEditOption) {
                                case 1:
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
            }


        if (!bookFound) {
            System.out.println("Sorry, we don't have that book here.");
        }
    }
}
