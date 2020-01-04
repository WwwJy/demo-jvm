package com.demo.io.bytecode;

/**
 * 1. 栈帧是一种用于帮助虚拟机执行方法调用与方法执行的数据结构
 * 2. 栈帧本身是一种数据结构，封装了方法的局部变量表、动态链接信息、方法的返回地址以及操作数栈等信息。
 *
 * 3. invokeinterface： 调用接口中的方法，实际上是在运行期决定的，决定到底调用实现该接口的哪个对象的特定方法。
 * 4. invokestatic: 调用静态方法。
 * 5. invokespecial: 调用自己的私有方法、构造方法(<init>) 以及父类的方法。
 * 6. invokevirtual: 抵用虚方法，运行期动态查找的过程。
 * 7. invokedynamic: 动态调用方法。
 *
 * 静态解析的4种情形:
 * 1. 静态方法
 * 2. 父类方法
 * 3. 构造方法
 * 4. 私有方法
 * 以上的4类方法称作为非虚方法，他们是在类加载阶段就可以将符号引用转换为直接引用的。
 */
public class ByteCodeDemo2 {

    public static void test(){
        System.out.println("test invoke");
    }
    public static void main(String[] args) {
        test();
    }
}
