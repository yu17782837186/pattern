package cn.com.pattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingleDemo01 implements Serializable {
    //饿汉式单例模式，static表变量会在装载时初始化，不会涉及多个线程对象访问
    //该对象的问题，虚拟机只会保证装载一次该类，不会发生并发的问题，可以省略synchronized关键字
    //问题：如果只是加载本类，而不是调用getInstance方法，永远不调用，则会造成资源浪费的问题

    //类初始化时，立即加载这个对象，天然的是线程安全的
    private static  SingleDemo01 instance = new SingleDemo01();
    private SingleDemo01() {
        if (instance != null) {//用来防止反射破解单例
            throw new RuntimeException();
        }
    }
    //方法没有同步，调用效率高
    public static SingleDemo01 getInstance() {
        return instance;
    }

    //用来防止反序列化来破解单例
    //在反序列化时，如果定义了readReslove()方法，则直接返回此方法指定
    //的对象，而不需要在单独创建新对象
//    private Object readResolve() throws ObjectStreamException {
//        return instance;
//    }
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }
}
