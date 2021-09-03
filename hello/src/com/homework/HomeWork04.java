package com.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        OrdinaryStaff ordinaryStaff = new OrdinaryStaff("tom",30,50,1);
        ordinaryStaff.print();
        DivisionManager divisionManager = new DivisionManager("jack",30,100,1.2);
        divisionManager.setBonus(5000);
        divisionManager.print();
    }
}
