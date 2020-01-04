package com.demo.io.bytecode;

/**
 * 方法的静态分派
 * Grandpa g1 = new Father();
 * 以上代码，g1的静态类型是Grandpa，而g1的实际类型是Father.
 * 结论： 变量的静态类型是不会发生变化的，而变量的实际类型则是可以发生变化的(多态的一种体现),实际类型是在运行期方可确定。
 */
public class ByteCodeDemo3 {

    // 方法的重载是一种静态的行为
    public void test(Grandpa grandpa){
        System.out.println("grandpa");
    }

    public void test(Father father){
        System.out.println("father");
    }

    public void test(Son son){
        System.out.println("son");
    }

    public static void main(String[] args) {
        Grandpa g1 = new Father();
        Grandpa g2 = new Son();
        ByteCodeDemo3 demo3 = new ByteCodeDemo3();
        demo3.test(g1);
        demo3.test(g2);
    }
}

class Grandpa{

}

class Father extends Grandpa {

}

class Son extends Father {

}
