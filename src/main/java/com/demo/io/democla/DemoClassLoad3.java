package com.demo.io.democla;

/**
 * Created by w景洋
 * on 2019/11/4
 */
public class DemoClassLoad3 {

    /**
     * 1. 对于数组实例来说，其类型是由JVM在运行期间动态生成的。表示为[L{package_name.className}]这种形式,动态生成的类型，其父类型就是Object
     * 2. 对于数组来说，JavaDoc经常将构成数组的元素成为Component, 实际上就是将数组降低一个维度后的类型。
     * @param args
     */
    public static void main(String[] args) {
        Test[] ts = new Test[1];
        System.out.println(ts.getClass());
        System.out.println(ts.getClass().getSuperclass());
        Test[][] ts2 = new Test[1][1];
        System.out.println(ts2.getClass());
        System.out.println(ts2.getClass().getSuperclass());

        System.out.println("==================");
        int[] is = new int[1];
        System.out.println(is.getClass());
        System.out.println(is.getClass().getSuperclass());
    }
}

class Test {

}
