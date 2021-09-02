package com.edu.poly_.polyarr_;

public class Student extends Person {
    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + "score=" + score;
    }
    public void study(){
        System.out.println("学生" + getName() + "正在学");
    }
}
