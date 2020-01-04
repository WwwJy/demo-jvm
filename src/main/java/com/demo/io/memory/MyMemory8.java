package com.demo.io.memory;

/**
 * -verbose:gc
 * -Xms20M
 * -Xmx20M
 * -Xmn10M
 * -XX:+PrintGCDetails
 * -XX:SurvivorRatio=8
 * -XX:+UseConcMarkSweepGC
 */
public class MyMemory8 {
    public static void main(String[] args) {
        int size = 1024 * 1024;
        byte[] myAlloc1 = new byte[4 * size];
        System.out.println("111111");
        System.out.println("");

        byte[] myAlloc2 = new byte[4 * size];
        System.out.println("222222");
        System.out.println("");

        byte[] myAlloc3 = new byte[4 * size];
        System.out.println("333333");
        System.out.println("");

        byte[] myAlloc4 = new byte[2 * size];
        System.out.println("444444");
        System.out.println("");
    }
}
