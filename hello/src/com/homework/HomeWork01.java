package com.homework;

public class HomeWork01 {
    public static void main(String[] args) {
//        Person xiaoming = new Person("小明", 10, "学生");
//        Person xiaohuang = new Person("小黄", 18, "学生");
//        Person xiaodong = new Person("小东", 12, "学生");
//        System.out.println(xiaoming);
//        System.out.println(xiaohuang);
//        System.out.println(xiaodong);
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if(arr[j]>arr[j+1]) {
//                    int temp = arr[i];
//                    arr[j] = arr[j+i];
//                    arr[j+i] = temp;
//                }
//            }
//        }
//
        Person[] persons = new Person[3];
        persons[0] = new Person("jack",10,"javaEE");
        persons[1] = new Person("tom",50,"大数据");
        persons[2] = new Person("mary",20,"php");
        Person tmp = null;
        for (int i = 0; i < persons.length-1; i++) {
            for (int j = 0; j < persons.length-1-i; j++) {
                if(persons[i].getAge()>persons[i+1].getAge()) {
                    tmp = persons[i];
                    persons[i] = persons[i+1];
                    persons[i+1] = tmp;
                }
            }
            System.out.println(persons[i]);
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }


    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}



//class Person {
//    String name;
//    int age;
//    String job;
//
//    public Person(String name, int age, String job) {
//        this.name = name;
//        this.age = age;
//        this.job = job;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//}
