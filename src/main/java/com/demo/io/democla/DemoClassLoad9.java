package com.demo.io.democla;

/**
 * Created by w景洋
 * on 2019/11/9
 */
public class DemoClassLoad9 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        DemoClassLoad7 load9 = new DemoClassLoad7("load9");
        Class<?> clazz = load9.loadClass("com.demo.io.democla.domain.MySimple");
        System.out.println(clazz.hashCode());
        // 如果注释掉该行，那么并不会实例化MySimple对象。
        // 因此不会实例化MyCat,即没有对MyCat主动使用，这里就不会加载MyCat Class(并不一定，取决于JVM,JVM规范允许类加载器在预料到某个类将要被加载，就预先加载它)
        Object obj = clazz.newInstance();
    }
}
