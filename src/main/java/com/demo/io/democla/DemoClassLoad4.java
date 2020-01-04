package com.demo.io.democla;

/**
 * Created by w景洋
 * on 2019/11/4
 */
public class DemoClassLoad4 {
    /**
     * 准备阶段，给静态变量赋默认值，引用类型为null， 基本类型为0
     * 初始化阶段，给静态变量赋初始值，自上而下执行代码
     * @param args
     */
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println("count1 : " + Singleton.count1);
        System.out.println("count2 : " + Singleton.count2);
    }
}
class Singleton {
    public static int count1;
    private static  Singleton singleton = new Singleton();

    private Singleton() {
        count1 ++;
        count2 ++;
        System.out.println(count1);
        System.out.println(count2);
    }

    public static int count2 = 0;

    public static Singleton getInstance(){
        return singleton;
    }
}
