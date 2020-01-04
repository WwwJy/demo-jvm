package com.demo.io.memory;

public class MyMemory7 {

    /**
     * -verbose:gc
     * -Xmx200M
     * -Xmn50m
     * -XX:TargetSurvivorRatio=60
     * -XX:+PrintTenuringDistribution
     * -XX:+PrintGCDetails
     * -XX:+PrintGCDateStamps
     * -XX:+UseConcMarkSweepGC
     * -XX:+UseParNewGC
     * -XX:MaxTenuringThreshold=3
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        byte[] byte_1 = new byte[512 * 1024];
        byte[] byte_2 = new byte[512 * 1024];

        myGc();
        Thread.sleep(1000);
        System.out.println("111111");
        System.out.println("");

        myGc();
        Thread.sleep(1000);
        System.out.println("222222");
        System.out.println("");

        myGc();
        Thread.sleep(1000);
        System.out.println("333333");
        System.out.println("");

        myGc();
        Thread.sleep(1000);
        System.out.println("444444");
        System.out.println("");

        byte[] byte_3 = new byte[1024 * 1024];
        byte[] byte_4 = new byte[1024 * 1024];
        byte[] byte_5 = new byte[1024 * 1024];

        myGc();
        Thread.sleep(1000);
        System.out.println("555555");
        System.out.println("");

        myGc();
        Thread.sleep(1000);
        System.out.println("666666");
        System.out.println("");
        System.out.println("hello world");
    }

    private static void myGc(){
        for (int i=0; i<40; i++) {
            byte[] bytes = new byte[1024 * 1024];
        }
    }
}
