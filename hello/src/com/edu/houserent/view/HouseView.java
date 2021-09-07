package com.edu.houserent.view;

import com.edu.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    public void mainMenu(){
        do {
            System.out.println("==========菜单==========");
            System.out.println("\t\t\t1 新增房源 ");
            System.out.println("\t\t\t2 查找房源 ");
            System.out.println("\t\t\t3 删除房源 ");
            System.out.println("\t\t\t4 修改房源 ");
            System.out.println("\t\t\t5 房源列表 ");
            System.out.println("\t\t\t6 退   出 ");
            System.out.println("请输入你的选择1-6");
            key = Utility.readChar();
            switch (key) {
                case '1' :
                    System.out.println("新增房源");
                    break;
                case '2' :
                    System.out.println("查找房源");
                    break;
                case '3' :
                    System.out.println("删除房源");
                    break;
                case '4' :
                    System.out.println("修改房源");
                    break;
                case '5' :
                    System.out.println("房源列表");
                    break;
                case '6' :
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        } while (loop);
    }
}

//
//package com.edu.houserent.view;
//
//        import com.edu.houserent.utils.Utility;
//
//public class HouseView {
//    private boolean loop  = true;
//    private char key = ' ';
//    public void mainMenu(){
//        do {
//            System.out.println("==========菜单==========");
//            System.out.println("\t\t\t1 新增房源 ");
//            System.out.println("\t\t\t2 查找房源 ");
//            System.out.println("\t\t\t3 删除房源 ");
//            System.out.println("\t\t\t4 修改房源 ");
//            System.out.println("\t\t\t5 房源列表 ");
//            System.out.println("\t\t\t6 退   出 ");
//            System.out.println("请输入你的选择1-6");
//            key = Utility.readChar();
//            switch (key) {
//                case '1' :
//                    System.out.println("新增房源");
//                    break;
//                case '2' :
//                    System.out.println("查找房源");
//                    break;
//                case '3' :
//                    System.out.println("删除房源");
//                    break;
//                case '4' :
//                    System.out.println("修改房源");
//                    break;
//                case '5' :
//                    System.out.println("房源列表");
//                    break;
//                case '6' :
//                    System.out.println("退出");
//                    loop = false;
//                    break;
//            }
//        } while (loop);
//    }
//}
