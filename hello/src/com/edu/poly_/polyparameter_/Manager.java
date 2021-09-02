package com.edu.poly_.polyparameter_;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, Double salary, Double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("经理 " + getName() + " is managing");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
