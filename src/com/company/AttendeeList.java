package com.company;

import java.util.ArrayList;

public class AttendeeList {

    private ArrayList<Attendees> attendeeList = new ArrayList<>();

    public void addAnAttendee(Attendees guest){
        attendeeList.add(guest);
    }
}
