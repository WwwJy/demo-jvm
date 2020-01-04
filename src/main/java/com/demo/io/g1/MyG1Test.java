package com.demo.io.g1;

public class MyG1Test {

    /**
     * -verbose:gc
     * -Xmx10m
     * -Xms10m
     * -XX:+UseG1GC
     * -XX:+PrintGCDetails
     * -XX:+PrintGCDateStamps
     * -XX:MaxGCPauseMillis=200m
     * @param args
     */
    public static void main(String[] args) {
        int size = 1024 * 1024;  // 1m
        byte[] myAlloc1 = new byte[size];
        byte[] myAlloc2 = new byte[size];
        byte[] myAlloc3 = new byte[size];
        byte[] myAlloc4 = new byte[size];
        System.out.println("hello world !");
    }
}
