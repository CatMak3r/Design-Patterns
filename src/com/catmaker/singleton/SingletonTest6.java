package com.catmaker.singleton;

/**
 * SingletonTest6
 * 静态内部类
 *
 * @author chenhang
 * @date 2020/3/17 22:49
 */
public class SingletonTest6 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton6 {
    private Singleton6() {}

    /**
     * 写一个静态内部类，该类中有一个静态属性Singleton6
     */
    private static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    /**
     * 提供一个静态方法，直接返回SingletonInstance.INSTANCE
     * @return
     */
    public static synchronized Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}