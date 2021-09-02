package com.edu.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("jack",18,100);
        persons[2] = new Student("smith",19,120);
        persons[3] = new Teacher("scott",40,20000);
        persons[4] = new Teacher("king",50,21000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say()); // 动态绑定机制
            if(persons[i] instanceof Student) {
                Student student = (Student)persons[i]; //向下转型
                student.study();
            }
        }
    }
}
