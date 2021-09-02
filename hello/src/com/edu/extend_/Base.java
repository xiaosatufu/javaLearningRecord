package com.edu.extend_;

public class Base {
    private final int n4 = 400;
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;

    //    public Base() { // 无参构造器
//        System.out.println("父类构造器被调用base()");
//    }
    public Base(String name, int age) {
        System.out.println("父类Base(Stringname, int age)被调用");
    }

    public int getN4() {
        return n4;

    }

    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public void callTest400() {
        test400();
    }
}
