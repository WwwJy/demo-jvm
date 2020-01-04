package com.demo.io.bytecode;

public class ByteCodeDemo1 {
    /**
     * javap -c com.demo.io.bytecode.ByteCodeDemo1  详细信息
     * javap -verbose com.demo.io.bytecode.ByteCodeDemo1 冗余信息
     * 反编译查看信息
     */
    private int a = 1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
