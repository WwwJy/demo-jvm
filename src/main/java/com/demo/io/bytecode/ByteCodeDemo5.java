package com.demo.io.bytecode;

/**
 * 3. 基于栈的指令集与基于寄存器的指令集之间的关系:
 *     a. JVM执行指令时所采取的方式是基于栈的指令集.
 *     b. 基于栈的指令集主要的操作有入栈和出栈两种。
 *     c. 基于栈的指令集的优势在于它可以在不同平台之间移植，而基于寄存器的指令集是与硬件架构紧密关联的，无法做到可移植。
 *     d. 基于栈的指令集的缺点在于完成相同的操作，指令集数量通常要比基于寄存器的指令集数量多;
 *     基于栈的指令集是在内存中完成操作的，而基于寄存器的指令集是直接由CPU来执行的，它是在高速缓冲区中进行执行的，速度要快很多。
 *     虽然虚拟机可以采用一些优化手段，但总体来说，基于栈的指令集的执行速度要慢一些。
 */
public class ByteCodeDemo5 {
    /**
     * 0 iconst_1
     * 1 istore_1  -- 把值从栈中取出，存入局部变量表索引为1的位置
     * 2 iconst_2
     * 3 istore_2  --
     * 4 iconst_3
     * 5 istore_3 --
     * 6 iconst_4
     * 7 istore 4  ** istore_n == istore n 只是指令集的一种常用指令简写方式
     * 以上为基于栈的指令集的赋值过程
     * 1 iload_1  --- 将局部变量表中索引为1的元素压入栈顶
     * 2 iload_2  --- 将局部变量表中索引为2的元素压入栈顶
     * 3 iadd     --- 将栈中顶部两个元素弹出进行相加，把结果压入栈顶(1+2 = 3) 此时栈顶为3
     * 4 iload_3  --- 将局部变量表中索引为3的元素压入栈顶
     * 5 isub     --- 将栈中顶部两个元素弹出进行相减，把结果压入栈顶(3-3 = 0) 此时栈顶为0
     * 6 iload 4  --- 将局部变量表中索引为4的元素压入栈顶
     * 7 imul     --- 将栈中顶部两个元素弹出进行相乘，把结果压入栈顶(4*0 = 0) 此时栈顶为0
     * 8 istore 5 --- 将栈顶元素弹出记录到局部变量表索引为5的位置
     * 9 iload 5  --- 将局部变量表中索引为5的元素压入栈顶
     * 10 ireturn --- 返回
     *
     */
    public int myCalculate(){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int result = (a + b - c) * d ;
        return result;
    }
}