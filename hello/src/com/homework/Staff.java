package com.homework;

public class Staff {
    private String name;
    private double dailyWage;
    private int workingDays;
    private double grade;


    public Staff(String name, double dailyWage, int workingDays, double grade) {
        this.name = name;
        this.dailyWage = dailyWage;
        this.workingDays = workingDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(int dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void print(){
        System.out.println("工资： " + dailyWage*workingDays*grade);
    }
}
