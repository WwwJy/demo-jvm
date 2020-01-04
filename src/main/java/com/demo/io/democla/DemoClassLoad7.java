package com.demo.io.democla;

import java.io.*;

/**
 * Created by w景洋
 * on 2019/11/6
 */
public class DemoClassLoad7 extends ClassLoader {

    private String classLoaderName;
    private String path;
    private final String fileExtension = ".class";

    public DemoClassLoad7(String classLoaderName) {
        super();// 将系统类加载器当做该类的父加载器
        this.classLoaderName = classLoaderName;
    }

    public DemoClassLoad7(ClassLoader classLoader , String classLoaderName) {
        super(classLoader); // 显示指定加载器作为该类的父加载器
        this.classLoaderName = classLoaderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("findClass invoked: " + name);
        System.out.println("class loader name: " + this.classLoaderName);
        byte[] data = this.loadClassData(name);
        return this.defineClass(name,data,0,data.length);
    }

    private byte[] loadClassData(String name){
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

        name = name.replace(".","\\");
        try {
            this.classLoaderName = this.classLoaderName.replace(".","/");
            is = new FileInputStream(new File(this.path + name + this.fileExtension));
            byteArrayOutputStream = new ByteArrayOutputStream();
            int ch = 0;
            while (-1 != (ch = is.read())){
                byteArrayOutputStream.write(ch);
            }
            data = byteArrayOutputStream.toByteArray();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                is.close();
                byteArrayOutputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return data;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        DemoClassLoad7 load7 = new DemoClassLoad7("load7");
        load7.setPath("C:\\Users\\13712\\Desktop\\test\\");
        Class<?> cla7 = load7.loadClass("com.demo.io.democla.DemoClassLoad6");
        System.out.println("class: " + cla7.hashCode());
        Object obj = cla7.newInstance();
        System.out.println(obj);

        DemoClassLoad7 load71 = new DemoClassLoad7("load71");
        load71.setPath("C:\\Users\\13712\\Desktop\\test\\");
        Class<?> cla71 = load71.loadClass("com.demo.io.democla.DemoClassLoad6");
        System.out.println("class: " + cla71.hashCode());
        Object obj2 = cla71.newInstance();
        System.out.println(obj2);
    }
}
