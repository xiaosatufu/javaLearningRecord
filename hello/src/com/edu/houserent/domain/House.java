package com.edu.houserent.domain;

public class House {
    private int id;
    private String phone;
    private String name;
    private String address;
    private int rent;
    private String state;

    public House(int id, String name,String phone, String address, int rent, String state) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return  id +
                "\t" + phone +
                "\t" + name +
                "\t" + address +
                "\t" + rent +
                "\t" + state;
    }
}
