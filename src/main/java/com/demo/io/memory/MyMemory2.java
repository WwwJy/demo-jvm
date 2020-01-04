package com.demo.io.memory;

/**
 * 虚拟机栈溢出
 */
public class MyMemory2 {
    private int length;

    public int getLength() {
        return length;
    }

    public void test(){
        this.length++;
        test();
    }

    public static void main(String[] args) {
        // 设置运行参数 -Xss160k 表示虚拟机栈的大小
        // 用jvisualvm查看线程dump结果
        MyMemory2 m2 = new MyMemory2();
        try {
            m2.test();
        }catch (Throwable e){
            System.out.println(m2.length);
            e.printStackTrace();
        }
    }
}
