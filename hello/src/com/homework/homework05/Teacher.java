package com.homework.homework05;

public class Teacher extends Staff{
    private int classDay;
    private double classSal;
    public Teacher(String name, int age, double sal) {
        super(name, age, sal);
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public void print() {
        System.out.println("工资总和：" + (getSal()*12 + classDay*classSal));
    }
}
