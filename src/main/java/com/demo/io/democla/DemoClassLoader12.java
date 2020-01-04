package com.demo.io.democla;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by w景洋
 * on 2019/11/12
 */
public class DemoClassLoader12 {
    public static void main(String[] args) {
        //当前类的加载器为应用类加载器，所以应用类加载器可以找到sql的驱动，通过线程上下文传递，由应用类加载sql的驱动
        // 应用类加载器的父亲是扩展类加载器，因为扩展类加载器在他的扩展路径下(java.ext.dirs) 找不到sql的驱动，所以加载不了
        Thread.currentThread().setContextClassLoader(DemoClassLoader12.class.getClassLoader());
        // Thread.currentThread().setContextClassLoader(DemoClassLoader12.class.getClassLoader().getParent());

        ServiceLoader<Driver> sd = ServiceLoader.load(Driver.class);
        Iterator<Driver> it = sd.iterator();
        while (it.hasNext()){
            Driver d = it.next();
            System.out.println("driver: " + d.getClass() + ", loader: " + d.getClass().getClassLoader());
        }
        System.out.println("当前线程上下文类加载器: " + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器: " + ServiceLoader.class.getClassLoader());
    }
}
