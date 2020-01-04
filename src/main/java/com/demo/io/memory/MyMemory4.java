package com.demo.io.memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * 方法区产生内存溢出错误
 */
public class MyMemory4 {

    public static void main(String[] args) {
        // -XX:MaxMetaspaceSize=10m
        // jdk>=1.8 设置元空间大小，不设置的话默认为堆外空间，会不断动态扩容直到机器内存满
        for (;;){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(MyMemory4.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor)(obj,method,args1,proxy) -> proxy.invokeSuper(obj,args1));
            System.out.println("hello world");
            enhancer.create();
        }
    }
}
