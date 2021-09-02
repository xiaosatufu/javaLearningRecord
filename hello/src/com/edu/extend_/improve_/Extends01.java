package com.edu.extend_.improve_;

//import com.edu.extend_.Graduate;
//import com.edu.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
//        com.edu.extend_.Pupil pupil = new Pupil();

        Pupil pupil = new Pupil();
        pupil.name = "晓明111";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("===========");
//        com.edu.extend_.Graduate graduate = new Graduate();
        Graduate graduate = new Graduate();
        graduate.name = "金角大王333";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
