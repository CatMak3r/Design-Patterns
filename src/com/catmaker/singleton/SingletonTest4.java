package com.catmaker.singleton;

/**
 * SingletonTest4
 * 懒汉式（线程安全，同步方法）
 *
 * @author chenhang
 * @date 2020/3/17 22:37
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        System.out.println("懒汉式 2 ， 线程安全~");
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

class Singleton4 {
    private static Singleton4 instance;
    private Singleton4() {}

    /**
     * 提供一个静态的共有方法，在调用时才创建单例对象
     * 并使用synchronized关键字解决线程安全问题
     * @return
     */
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}