package com.demo.io.democla;

/**
 *  考察类加载的时机，过程。 静态变量引用，会导致类的加载，类加载会导致静态代码块的初始化，子类的加载会先加载父类
 *  -XX:+TraceClassLoading 用于追踪类的加载信息
 *  -XX:+<option>, 表示开启option选项
 *  -XX:-<option>, 表示关闭option选项
 *  -XX:<option> = <value>, 表示将option选项的值设置为value
 *
 *  助记符:
 *  ldc表示将int, float或是String类型的常量值从常量池中推送至栈顶
 *  bipush表示将单字节(-128 ~ 127)的常量值推送至栈顶
 *  sipush表示将一个短整型常量值(-32769 ~ 32767) 推送至栈顶
 *  iconst_1 表示将int类型的1推送至栈顶(iconst_1 ~ iconst_5)
 */
public class DemoClassLoad1 {
    public static void main(String[] args) {
        System.out.println(MyDemo3.str3);
    }
}

class MyDemo1 {
    public static String str = "Hello World";

    static {
        System.out.println("MyDemo1");
    }
}

class MyDemo2 extends MyDemo1 {
    public static String str2 = "Hello Sir";
    static {
        System.out.println("MyDemo2");
    }
}

class MyDemo3 {
    // 常量在编译阶段会存入到调用这个常量的方法的所在类的常量池中
    // 本质上，调用类并没有直接引用到定义常量的类，因此并不会触发定义常量类的初始化
    public static final String str3 = "Hello";
    static {
        System.out.println("MyDemo3");
    }
}
