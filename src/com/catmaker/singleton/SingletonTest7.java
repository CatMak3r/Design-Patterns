package com.catmaker.singleton;

/**
 * SingletonTest7
 * 枚举
 *
 * @author chenhang
 * @date 2020/3/17 22:54
 */
public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton7 instance = Singleton7.INSTANCE;
        Singleton7 instance2 = Singleton7.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }

}

enum Singleton7 {
    INSTANCE;
}