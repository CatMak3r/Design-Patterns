# 单例模式

采取一定方式保证在整个软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象示例的方法（静态方法）



### 👍🏻饿汉式（静态常量）

步骤：

1. 构造器私有化（防止new）
2. 类的内部创建对象
3. 向外暴露一个静态的公共方法（getInstance）



```java
public class Singleton {
    //1. 构造器私有化
    private Singleton() {}
    
    //2. 类的内部创建对象
    private final static Singleton instance = new Singleton();
    
    //3. 对外提供一个静态的公共方法
    public static Singleton getInstance() {
        return instance;
    }
}
```

#### 优点

写法简单，在类装载的时候就完成实例化。避免了线程同步问题

#### 缺点

因为类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终都没用过这个类，那么就会造成内存的浪费



有可能出现getInstance以外的方式装载该类

这种单例模式可用，可能造成内存浪费



### 👍🏻饿汉式（静态代码块）



```java
public class Singleton {
    private Singleton() {}
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance() {
        return instance;
    }
}
```

优缺点与上一种相同



### 懒汉式（线程不安全）



```java
public class Singleton {
    private Singleton() {}
    private static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

#### 优缺点

起到了Lazy Loading的效果，但是只能在单线程下使用。

但是如果在多线程的条件下，一个线程正在判断if (instance == null)，而另外一个线程后来居上通过了这个判断，这是就会产生多个实例。

在实际开发中，不要使用这种方式。



### 懒汉式（线程安全，同步方法）



```java
public class Singleton {
    private Singleton() {}
    private static Singleton instance;
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

#### 优缺点说明

1. 解决了线程不安全问题
2. 效率太低。每个线程在想要获取实例，调用getInstance方法的时候都需要进行同步。然后getInstance方法只需要执行一次就可以，后面再需要该类实例，直接return即可。该方法效率太低
3. 在实际开发中，不推荐使用这种方法



### 懒汉式（线程安全，同步代码块）

和上面一种相同。

```java
public class Singleton {
    private Singleton() {}
    private static Singleton instance;
    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
    
}
```



### 👍🏻双重检查



```java
public class Singleton {
    private Singleton() {}
    private static volatile Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return Singleton
    }
}
```

#### 优缺点说明

1. 保证了线程安全
2. 防止实例化多次。在第一次实例化以后，之后getInstance在第一个if (instance == null)就return了，不用再进行同步

总结：线程安全，延迟加载，效率较高

在实际开发中推荐使用这种单例模式



### 👍🏻静态内部类

- 在Singleton被装载的时候，静态内部类是不会被装载的
- 在调用getInstance的时候会装载SingletonInstance，类在装载的时候是线程安全的

```java
public class Singleton {
    // 在Singleton被装载的时候，静态内部类是不会被装载的
    // 在调用getInstance的时候会装载SingletonInstance，类在装载的时候是线程安全的
    private Singleton() {}
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();   
    }
    public static Singleton() {
        return SingletonInstance.INSTANCE;   
    }
}
```

#### 优缺点说明

1. 采用类装载的机制保证初始化实例时只有一个线程
2. 静态内部类方式在Singleton类被装载的时候并不会立即实例化，而是在调用getInstance方法时，才会装载SingletonInstance类从而完成Singleton的实例化。
3. 类的静态属性只会在第一次加载类的时候初始化。所以JVM帮助我们保证了线程的安全性，在类的初始化时，别的线程是无法进入的。
4. 优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
5. **推荐使用**



### 👍🏻枚举



```java
enum Singleton {
    INSTANCE;
}
```

#### 优缺点分析

1. 不仅能够**避免多线程同步问题**，而且还可以**防止反序列化重新创建新的对象**。
2. 这种方式是*Effective Java*作者*Josh Blosh*提倡的方式
3. **推荐使用**



### 单例模式在JDK应用的源码分析

在JDK中，java.lang.Runtime就是经典的单例模式（饿汉式）

![image.png](https://cdn.nlark.com/yuque/0/2020/png/701218/1582732256111-b96aceef-c93e-4508-b385-d664a0ec957b.png)

### *单例模式注意事项和细节说明*

1. 单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，对于一些**需要频繁创建销毁的对象**，使用单例模式可以提高系统性能
2. 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是new
3. 单例模式使用的场景：

1. 1. 需要**频繁的进行创建和销毁**的对象
   2. 创建对象时**耗时过多或耗费资源过多**（重量级对象），但又经常用到的对象
   3. **工具类**对象
   4. **频繁访问数据库或文件**的对象（比如数据源，session工厂等）