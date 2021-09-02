package com.edu.extend_;

public class Sub  extends Base{
    public Sub(){ // 无参构造器
//        super(); //默认调用父类的无参构造器
        super("smith",10);
        System.out.println("Sub()");
    }

    public Sub(String name) {
        super("tom",30);
    }

    public void sayOk(){//子类方法
        //非私有的属性和方法可以在子类直接访问
        System.out.println(n1 + "" + n2 + " " + n3 );
        test100();
        test200();
        test300();
//        test400();
        System.out.println(getN4());
    }
}
