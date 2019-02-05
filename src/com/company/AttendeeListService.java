package com.company;

import java.util.ArrayList;

public class AttendeeListService extends Attendees {

    private ArrayList<Attendees> attendeeList = new ArrayList<>();

    public void addAnAttendee(Attendees guest){
        attendeeList.add(guest);
        guest.setId(idGenerator());
    }

    public int idGenerator() {
        return attendeeList.size();
    }

    public void printDetails(){
        for(Attendees a : attendeeList){
            System.out.println(a);
        }
    }
}
