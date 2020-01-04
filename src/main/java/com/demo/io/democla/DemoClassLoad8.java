package com.demo.io.democla;

/**
 * Created by w景洋
 * on 2019/11/9
 */
public class DemoClassLoad8 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InterruptedException {
        DemoClassLoad7 load8 = new DemoClassLoad7("load8");
        load8.setPath("C:\\Users\\13712\\Desktop\\test\\");
        Class<?> cla8 = load8.loadClass("com.demo.io.democla.DemoClassLoad6");
        System.out.println("class: " + cla8.hashCode());
        Object obj = cla8.newInstance();
        System.out.println(obj);
        Thread.sleep(3000);
        load8 = null;
        cla8 = null;
        obj = null;
        System.gc();
        // 用Java visual VM 查看类卸载
        Thread.sleep(10000);
    }
}
