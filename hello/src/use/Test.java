package use;

import com.xiaoqiang.Dog;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        int[] arr = {1,3,33,45,12};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
