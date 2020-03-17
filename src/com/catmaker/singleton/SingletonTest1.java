package com.catmaker.singleton;

/**
 * Singleton1
 * 饿汉式（静态常量）
 *
 * @author chenhang
 * @date 2020/3/17 22:14
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        // 测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode: " + instance.hashCode());
        System.out.println("instance2.hashCode: " + instance2.hashCode());
    }
}

class Singleton {
    /**
     * 1. 构造器私有化
     */
    private Singleton() {}

    /**
     * 2. 本类内部创建对象实例
     */
    private final static Singleton instance = new Singleton();

    /**
     * 3. 提供一个共有的静态方法，返回实例对象
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}