package com.company;

public class Attendees {

    private String name;
    private String address;
    private String state;
    private String email;
    private String date;
    private String specialRequests;
    private int id;

    public Attendees () {

    }

    public Attendees(String name, String address, String state, String email, String date, String specialRequests) {
        this.name = name;
        this.address = address;
        this.state = state;
        this.email = email;
        this.date = date;
        this.specialRequests = specialRequests;
    }

    public Attendees(String name, String address, String state, String email, String date, String specialRequests, int id) {
        this.name = name;
        this.address = address;
        this.state = state;
        this.email = email;
        this.date = date;
        this.specialRequests = specialRequests;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
