package com.edu.encap;

public class Account {
    private String name;
    private double balance;
    private String pwd;


    public Account() {
    }

    public Account(String name, double balance, String pwd) {
//        this.name = name;
//        this.balance = balance;
//        this.pwd = pwd;
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名要求2-4");
            this.name = "jack";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20");
            this.balance = 0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
        } else {
            System.out.println("密码必须为6位");
            this.pwd = "000000";
        }
        this.pwd = pwd;
    }
    public void showInfo() {
        System.out.println("账号信息name = " + name + "余额" + balance + "密码" + pwd);
    }


}
