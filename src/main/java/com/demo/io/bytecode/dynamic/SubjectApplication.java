package com.demo.io.bytecode.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SubjectApplication {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        SubjectImpl si = new SubjectImpl();
        InvocationHandler ds = new DynamicSubject(si);
        Class<?> cla = si.getClass();
        Subject subject = (Subject) Proxy.newProxyInstance(cla.getClassLoader(),cla.getInterfaces(),ds);
        subject.request();
    }
}
