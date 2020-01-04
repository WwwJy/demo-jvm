package com.demo.io.democla;


/**
 * Created by w景洋
 * on 2019/11/5
 */
public class DemoClassLoad6 {

    /**
     * 获取ClassLoader的途径
     * 1. 获取当前类的ClassLoader: class.getClassLoader();
     * 2. 获取当前上下文的ClassLoader: Thread.currentThread().getContextClassLoader();
     * 3. 获得系统的ClassLoader: ClassLoader.getSystemClassLoader();
     * 4. 获取调用者的ClassLoader: DriverManager.getCallerClassLoader();
     *
     * @param args
     */
    public static void main(String[] args) {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader);
        while (null != loader){
            loader = loader.getParent();
            System.out.println(loader);
        }
    }
}
