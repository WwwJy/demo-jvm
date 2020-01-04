package com.demo.io.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 虚拟机栈： Stack Frame 栈帧  --- 线程独有
 * 2. 程序计数器(Program Counter)  --- 线程独有
 * 3. 本地方法栈：主要用于执行本地方法  --- native方法(不是java编写的，主要是C++编写的)
 *
 * 4. 堆(Heap): JVM管理的最大一块内存空间  --- 与堆相关的一个重要概念是垃圾收集器。现代几乎所有的垃圾收集器都是采用的分代收集算法，所以堆空间也基于这一点进行了相应的划分: 新生代与老年代。Eden空间，From Survivor空间与To Survivor空间。
 *
 * 5. 方法区(Methodd Area)： 存储元信息。 永久代(Permanent Generation), 从JDK1.8开始，已经彻底废弃了永久代，使用元空间(meta space)
 * 6. 运行时常量池: 方法区的一部分。(字面值和符号引用)
 * 7. 直接内存: Direct Memory(堆外内存, 由操作系统管理)，与Java NIO密切相关。 JVM通过堆上的DirectByteBuffer来操作直接内存。
 *
 * new 关键字创建对象的3个步骤
 * 1. 在堆内存中创建出对象的实例。  --- 在类加载、链接、初始化完成后，给对象分配多少内存已经确定
 * 2. 为对象的实例成员变量赋初值。
 * 3. 将对象的引用返回。
 * 指针碰撞 (前提是堆中的空间通过一个指针进行分割，一侧是已经被占用的空间，另一侧是未被占用的空间)
 * 空闲列表 (前提是堆内存空间中已被使用和未被使用的空间交织在一起时，这时，虚拟机就需要通过一个列表来记录哪些空间是可以使用的，哪些空间是已被使用的，接下来找出可以容纳下新创建的对象且未被使用的空间，在此空间存放该对象，同时还需要修改列表上的记录)
 *
 * 对象在内存中的布局：
 * 1. 对象头
 * 2. 实例数据(即我们在一个类中所声明的各项信息)
 * 3. 对齐填充(可选)
 *
 * 引用访问对象的方式:
 * 1. 使用句柄的方式.
 * 2. 使用直接指针的方式.
 */
public class MyMemory1 {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        // -Xms5m -Xmx5m -XX:+HeapDumpOnOutOfMemoryError
        // 设置堆的空间最大和最小为5M， 并且打印出内存溢出的错误
        for (;;){
            list.add(new MyMemory1());

            // 用jvisualvm查看内存情况， 修改堆大小为2m，继续查看
            System.gc();
        }
    }
}
