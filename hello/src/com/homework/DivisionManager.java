package com.homework;

public class DivisionManager extends Staff {
    private double bonus;
    public DivisionManager(String name, double dailyWage, int workingDays, double grade) {
        super(name, dailyWage, workingDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void print() {
        System.out.println("经理：" + getName() + (bonus + getWorkingDays()*getDailyWage()*getGrade()));
    }
}
