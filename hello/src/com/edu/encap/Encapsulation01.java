package com.edu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
//        person.name = "jack";
        Person smith = new Person("smith", 2000, 300);
        System.out.println(smith.info());


    }
}
class Person {
    public String name;
    private int age;
    private double salary;
    //构造器
    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {

        if(name.length()>=2 && name.length()<=6) {
            this.name = name;
        } else {
            System.out.println("输入姓名的长度不对");
            this.name = "佚名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1 && age<=100) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1-120");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "信息为：name=" + name + "age=" + age + "salary=" + salary;
    }

    //    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
}