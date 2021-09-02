package com.edu.poly_.polyarr_;

public class Teacher extends Person{
    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + "salary = " + salary;
    }
    public void teach(){
        System.out.println("老师" + getName() + "正在授课");
    }
}
