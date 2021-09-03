package com.homework;

public class OrdinaryStaff extends Staff{
    public OrdinaryStaff(String name, double dailyWage, int workingDays, double grade) {
        super(name, dailyWage, workingDays, grade);
    }

    @Override
    public void print() {
//        super.print();
        System.out.println("普通员工工资：" + getWorkingDays()*getDailyWage()*getGrade());
    }
}
