package com.edu.poly_.polyparameter_;

public class Worker extends Employee{
    public Worker(String name, Double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("普通员工 " + getName() + " is working");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
