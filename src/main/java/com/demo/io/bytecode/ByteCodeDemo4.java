package com.demo.io.bytecode;

/**
 * 方法的动态分派
 *
 */
public class ByteCodeDemo4 {

    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        apple.test();
        orange.test();

        apple = new Orange();
        apple.test();
    }
}

class Fruit {
    public void test(){
        System.out.println("fruit");
    }
}

class Apple extends Fruit {
    @Override
    public void test() {
        System.out.println("apple");
    }
}

class Orange extends Fruit {
    @Override
    public void test() {
        System.out.println("orange");
    }
}
