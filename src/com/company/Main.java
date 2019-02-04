package com.company;

public class Main {

    public static void main(String[] args) {

        AttendeeList testList = new AttendeeList();
        Attendees attendee = new Attendees("Christie", "123 Bakers Ln", "Michigan", "christie@gmail.com", "07-14-19", "vegan");
        Attendees attendee1 = new Attendees("Omar", "9 Mile RD", "Michigan", "oatcho@gmail.com", "07-13-19", "kosher");

        testList.addAnAttendee(attendee);
        testList.addAnAttendee(attendee1);

        testList.printDetails();
    }
}
