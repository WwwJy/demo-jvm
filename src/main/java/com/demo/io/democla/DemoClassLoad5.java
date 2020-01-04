package com.demo.io.democla;

/**
 * Created by w景洋
 * on 2019/11/5
 */
public class DemoClassLoad5 {

    /**
     * 父亲委托机制加载类。
     * 从底向上传递
     * 从上到下加载，只要一个加载成功，则不再继续往下
     *
     * 调用ClassLoader类的loadClass方法加载一个类，并不是对类的主动使用，不会导致类的初始化
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class c1 = loader.loadClass("com.demo.io.democla.B");
        System.out.println(c1);
        System.out.println("==============================");
        Class c2 = Class.forName("com.demo.io.democla.B");
        System.out.println(c2);
        System.out.println("==============================");
        Class c3 = Class.forName("java.lang.String");
        System.out.println(c3.getClassLoader());
        Class c4 = Class.forName("com.demo.io.democla.C");
        System.out.println(c4.getClassLoader());


    }
}

class B {
    static {
        System.out.println("run B");
    }
}
class C {

}

