package com.demo.io.memory;


/**
 * 使用jmap -clstats PID 查看类加载器的信息
 *     jstat -gc PID 查看元空间信息
 *     查看这两个工具其他命令的使用方式
 *
 *     从jdk1.7开始增加的命令
 *     jcmd PID VM.flags -- 查看JVM启动阐述
 *     jcmd PID help: 列出当前运行的java进程可以执行的操作
 *     jcmd PID help (JFR.dump) 查看具体命令选项
 *     jcmd PID PerfCounter.print 查看JVM性能相关参数
 *     jcmd PID VM.uptime 查看jvm的运行时长
 *     jcmd PID GC.class_histogram 查看JVM类的统计信息
 *     jcmd PID Thread.print 查看JVM线程的统计信息
 *     jcmd PID GC.heap_dump {file.path} 导出Heap dump文件，导出的文件可以通过jvisualvm 查看
 *
 */
public class MyMemory5 {
    public static void main(String[] args) {
        for (;;){
            System.out.println("hello world");
        }
    }
}
