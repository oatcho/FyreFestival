package com.company;

import java.util.ArrayList;

public class AttendeeListService extends Attendees {

    private ArrayList<Attendees> attendeeList = new ArrayList<>();
    private ArrayList<Attendees> vipList = new ArrayList<>();

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

    public void printVIPDetails(){
        for(Attendees a : vipList){
            System.out.println(a);
        }
    }

    public void searchByState(String state){
        System.out.println("The following are general admission attendees:");
        for (int i = 0; i < attendeeList.size(); i++){
            if(attendeeList.get(i).getState().equalsIgnoreCase(state)){
                System.out.println(attendeeList.get(i));
            }
        }
        System.out.println("The following are VIP attendees:");
        for (int j = 0; j < vipList.size(); j++) {
            if(vipList.get(j).getState().equalsIgnoreCase(state)){
                System.out.println(vipList.get(j));
            }
        }
    }

    public Attendees searchByID(int id){
        Attendees a = new Attendees();
        for (int i = 0; i < attendeeList.size(); i++){
            if(attendeeList.get(i).getId() == id){
                a = attendeeList.get(i);
            }

        }
        return a;
    }

    public void addToVIP(int id){
        vipList.add(searchByID(id));
        attendeeList.remove(searchByID(id));
        System.out.println("This is the regular attendees list:");
        printDetails();
        System.out.println("This is the VIP list.");
        printVIPDetails();

    }

    public void removeGuest(int id){
        attendeeList.remove(searchByID(id));
        printDetails();
    }
}
