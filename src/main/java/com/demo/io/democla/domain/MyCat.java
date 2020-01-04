package com.demo.io.democla.domain;

/**
 * Created by w景洋
 * on 2019/11/9
 */
public class MyCat {
    public MyCat() {
        System.out.println("MyCat ClassLoad by: " + this.getClass().getClassLoader());
        // MyCat 对 MySimple的使用
//        System.out.println("from MyCat: " + MySimple.class);
    }
}
