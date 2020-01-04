package com.demo.io.bytecode.dynamic;

public class SubjectImpl implements Subject{
    @Override
    public void request() {
        System.out.println("From real subject");
    }
}
