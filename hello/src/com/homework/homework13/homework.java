package com.homework.homework13;

public class homework {
    public static void main(String[] args) {
        Student student = new Student("小明",'男',15,"000110001");
        student.printInfo();
        Teacher teacher = new Teacher("张飞", '女', 50, 5);
        teacher.printInfo();
    }
}
