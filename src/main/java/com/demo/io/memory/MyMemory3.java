package com.demo.io.memory;

/**
 * jconsole 死锁检测
 */
public class MyMemory3 {

    public static void main(String[] args) {
        new Thread(() -> A.method(), "method_A").start();
        new Thread(()-> B.method(), "method_B").start();
    }
}

class A {
    public static synchronized void method(){
        System.out.println("method A");
        try {
            Thread.sleep(3000);
            B.method();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class B {
    public static synchronized void method(){
        System.out.println("method B");
        try {
            Thread.sleep(3000);
            A.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
