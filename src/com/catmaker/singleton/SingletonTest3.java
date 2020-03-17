package com.catmaker.singleton;

/**
 * Singleton3
 * 懒汉式（线程不安全）
 *
 * @author chenhang
 * @date 2020/3/17 22:21
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        // 测试
        System.out.println("懒汉式1， 线程不安全");
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode: " + instance.hashCode());
        System.out.println("instance2.hashCode: " + instance2.hashCode());
    }
}

class Singleton3 {
    /**
     * 1. 构造器私有化
     */
    private Singleton3() {}

    /**
     * 2. 本类内部创建对象实例
     */
    private static Singleton3 instance;

    /**
     * 3. 提供一个共有的静态方法，
     * 当使用到该方法的时候，才会去创建instance，即懒汉式
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}