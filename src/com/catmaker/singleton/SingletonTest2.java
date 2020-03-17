package com.catmaker.singleton;

/**
 * Singleton2
 * 饿汉式（静态代码块）
 *
 * @author chenhang
 * @date 2020/3/17 22:21
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        // 测试
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode: " + instance.hashCode());
        System.out.println("instance2.hashCode: " + instance2.hashCode());
    }
}

class Singleton2 {
    /**
     * 1. 构造器私有化
     */
    private Singleton2() {}

    /**
     * 2. 本类内部创建对象实例
     *  这里是在静态代码块中创建单例对象
     */
    private static Singleton2 instance;
    static {
        instance = new Singleton2();
    }

    /**
     * 3. 提供一个共有的静态方法，返回实例对象
     */
    public static Singleton2 getInstance() {
        return instance;
    }
}