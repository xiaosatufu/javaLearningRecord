package com.edu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 完成零钱通的各个功能的类
 */
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "---------零钱通明细---------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";

    //完成菜单显示
    public void mainMenu() {
        do {
            System.out.println("\n---------零钱通菜单---------");
            System.out.println("1.零钱通明细");
            System.out.println("2.收益入账");
            System.out.println("3.消费");
            System.out.println("4.退出");
            System.out.println("请选择（1-4）");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误请重新选择 ");
            }
        } while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {

        System.out.println("请输入收益:");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益入账金额范围 需要大于等于0");
            return; //退出方法不再执行后面的代码
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;

        System.out.println(details);
    }

    //完成消费
    public void pay() {
        System.out.println("消费金额:");
        money = scanner.nextDouble();
        System.out.println("消费说明:");
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该在0-" + balance);
            return;
        }
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
