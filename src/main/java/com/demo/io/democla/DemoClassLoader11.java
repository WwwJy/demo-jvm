package com.demo.io.democla;

/**
 * Created by w景洋
 * on 2019/11/12
 */
public class DemoClassLoader11 implements Runnable{
    private Thread thread;

    public DemoClassLoader11() {
        this.thread = new Thread(this);
        this.thread.start();
    }

    public static void main(String[] args) {
        DemoClassLoader11 d = new DemoClassLoader11();
    }

    @Override
    public void run() {
        ClassLoader classLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);

        System.out.println("Class: " + classLoader.getClass());
        System.out.println("Parent: " + classLoader.getParent().getClass());
    }

}
