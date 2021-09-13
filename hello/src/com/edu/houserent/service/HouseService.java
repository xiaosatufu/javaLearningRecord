package com.edu.houserent.service;

import com.edu.houserent.domain.House;

public class HouseService {
    private House[] houses;
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"jack","112","haidianqu",2000,"未出租");
    }
    public House[] list(){
        return houses;
    }
}
