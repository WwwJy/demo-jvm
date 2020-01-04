package com.demo.io.democla;

import java.util.Random;

/**
 * Created by w景洋
 * on 2019/11/4
 */
public class DemoClassLoad2 {
    /**
     * 当一个接口在初始化时，并不要求其父类接口都完成了初始化，只有真正使用到父接口的时候(如引用接口中所定义的常量时)才会初始化。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(MyChild.b);
    }
}

interface MyParent{
    public static final int a = 1/0;
}

interface MyChild extends MyParent {
    public static final int b = new Random().nextInt();
}