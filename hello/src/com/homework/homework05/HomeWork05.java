package com.homework.homework05;

public class HomeWork05 {
    public static void main(String[] args) {
        Worker worker = new Worker("tom",10,1500);
        worker.print();

        Teacher teacher = new Teacher("jack",30,3000);
        teacher.setClassDay(20);
        teacher.setClassSal(100);
        teacher.print();
    }
}
