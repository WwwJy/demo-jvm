package com.demo.io.democla.domain;

/**
 * Created by w景洋
 * on 2019/11/9
 */
public class MySimple {

    // 1.
    // 加载了MySimple的加载器最终会加载MyCat。 这是加载器的双亲委派和全权委托的机制。
    // classpath中存在MySimple的字节码文件，但是没有MyCat的字节码文件。此时启动的时候，由应用类加载器加载MySimple。
    // MySimple初始化时，也由应用类加载器加载MyCat，由于MyCat在目录中不存在，所以会抛出找不到类的错误。(即使自定义了加载器，并且可以从磁盘中加载MyCat)

    // 2.
    // 如果classpath中存在MyCat的字节码文件。但是没有MySimple的字节码文件。此时由自定义加载器加载MySimple。
    // MySimple初始化时,由自定义加载器加载MyCat，此时根据双亲委派机制，自定义加载器会向上委派，最后会被应用类加载器加载(因为应用类加载器会在classpath找到MyCat的字节码文件)

    // 总结，当构造函数中存在其他类的引用。 此时加载器向上委派，如果存在能加载引用类的加载器，则加载成，否则抛出类找不到的错误。
    // 注意: 由于命名空间的存在。 父类加载器是找不到子加载器所加载的类的，但是子加载器可以找到父加载器加载的类。所以第二种情况在MyCat存在对MySimle类的使用，则会报错。

    // 子加载器加载的类能够访问父加载器加载的类。
    // 父加载器加载的类无法访问子加载器加载的类。
    public MySimple() {
        System.out.println("MySimple ClassLoad by: " + this.getClass().getClassLoader());
        new MyCat();
    }
}
