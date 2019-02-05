package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        AttendeeListService testList = new AttendeeListService();
        Attendees attendee = new Attendees("Christie", "123 Bakers Ln", "Michigan", "christie@gmail.com", "07-14-19", "vegan");
        Attendees attendee1 = new Attendees("Omar", "9 Mile RD", "Michigan", "oatcho@gmail.com", "07-13-19", "kosher");
        Attendees attendee2 = new Attendees("John", "123 idk lane", "Hawaii", "bob@gmail.com", "03-23-19", "none");

        testList.addAnAttendee(attendee);
        testList.addAnAttendee(attendee1);
        testList.addAnAttendee(attendee2);

        testList.printDetails();

        System.out.println("Welcome to the Fyre Festival! \n" +
                "I promise, this is going to happen\n" +
                "it's going to be great dudes/dudettes\n" +
                "If you are an attending the festival, press 1 to register your account information \n" +
                "If you are an administrator, press 2 to access the admin menu options \n" +
                "If you are finished, press 3 to exit");

        int userOption = scan.nextInt();
        switch (userOption) {
            case 1:
                System.out.println("Please enter your name:");
                scan.nextLine();
                String name = scan.nextLine();
                System.out.println("Please enter your street address:");
                String address = scan.nextLine();
                System.out.println("Please enter the state in which you reside:");
                String state = scan.nextLine();
                System.out.println("Please enter your email:");
                String email = scan.nextLine();
                System.out.println("Please enter your anticipated date of arrival:");
                String date = scan.nextLine();
                System.out.println("Please enter any special requests:");
                String specialRequests = scan.nextLine();
                Attendees tendies = new Attendees(name, address, state, email, date, specialRequests);
                testList.addAnAttendee(tendies);
                testList.printDetails();
                break;
            case 2:
                //admin menu going here
                AdminServices adSer = new AdminServices();
                //adds Admins to our arrayList in Admin Service class.
                adSer.addAdmins();
                //This method holds the menu for the Admins.
                adSer.adminCredCheck(testList);
                break;
            case 3:
                System.out.println("Thanks for using the Fyre Festival Tendies App, have a nice day!");
                break;
            default:
                System.out.println("Sorry, invalid response");
                break;
        }

    }
}
