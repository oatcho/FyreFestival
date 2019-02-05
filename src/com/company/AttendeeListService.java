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

    public void searchByState(String state){
        for (int i = 0; i < attendeeList.size(); i++){
            if(attendeeList.get(i).getState().equalsIgnoreCase(state)){
                System.out.println(attendeeList.get(i));
            }
        }
    }
}
