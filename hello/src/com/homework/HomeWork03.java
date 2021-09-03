package com.homework;

public class HomeWork03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("tom",18,"高级教师",20);
        System.out.println(teacher);
        teacher.introduce();
        Professor professor = new Professor("jack",50,"教授",50);
        professor.introduce();
    }
}


class Teacher {
    private String name;
    private int age;
    public String post;
    private double salary;

    public void introduce(){
        System.out.println("老师姓名：" + this.name + "老师年龄：" + this.age + "职称：" + this.post + "工资：" + this.salary);
    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}


class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary*1.3);
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
