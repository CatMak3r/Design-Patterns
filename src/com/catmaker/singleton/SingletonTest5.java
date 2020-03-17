package com.catmaker.singleton;

/**
 * SingletonTest5
 * 双重检查
 *
 * @author chenhang
 * @date 2020/3/17 22:45
 */
public class SingletonTest5 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton5 {
    private Singleton5() {}
    private static volatile Singleton5 instance;

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}