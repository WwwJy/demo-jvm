package com.demo.io.memory;

public class MyMemory6 {

    /**
     *
     * -verbose:gc 详细输出垃圾回收的日志
     * -Xms20M 初始堆的大小
     * -Xmx20M 堆的最大值
     * -Xmn10M 堆空间中新生代的大小是10M
     * -XX:+PrintGCDetails 打印出垃圾回收的详细信息
     * -XX:SurvivorRatio=8 eden和Survivor占比是8比1
     * -XX:MaxTenuringThreshold=5 设置可以晋升到老年代的最大存活年龄(JVM自动调节对象晋升，会出现JVM判断某个对象可能在年龄为2即可晋升到老年代)
     * -XX:+PrintTenuringDistribution 打印对象的年龄状况(多少对象年龄为1 多少对象年龄为2)
     *
     * -XX:PretenureSizeThreshold=1111(字节) 当新创建的对象大小超过这个预值的时候，对象将不会在新生代创建，直接在老年代创建。(必须是SerialGC才会生效)
     * -XX:+UseSerialGC 使用Serial垃圾收集器
     *
     * JDK 1.8 Hotspot
     * PSYoungGen: Parallel Scavenge(新生代垃圾收集器)
     * ParOldGen: Parallel Old (老年代垃圾收集器)
     */
    public static void main(String[] args) {
        int size = 1024 * 1024;
        byte[] myAlloc1 = new byte[2 * size];
        byte[] myAlloc2 = new byte[2 * size];
        byte[] myAlloc3 = new byte[2 * size];
        System.out.println("hello world !");
    }
}
