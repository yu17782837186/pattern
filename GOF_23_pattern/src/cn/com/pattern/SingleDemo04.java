package cn.com.pattern;

public class SingleDemo04 {
    //双重检测锁实现单例模式
    //这个模式将同步内容下放到if内部，提高了执行的效率，不必每次获取对象时都进行同步，
    //只有第一次才同步，创建了以后就没必要了
    //问题：由于编译器优化原因和JVM底层内部模型原因，偶尔会出现问题
    private static SingleDemo04 instance;

    private SingleDemo04() {

    }
    public static SingleDemo04 getInstance() {
        if (instance == null) {
            SingleDemo04 sd;
            synchronized (SingleDemo04.class){
                sd = instance;
                if (sd == null) {
                    synchronized (SingleDemo04.class) {
                        if (sd == null) {
                            sd = new SingleDemo04();
                        }
                    }
                    instance = sd;
                }
            }
        }
        return instance;
    }
}
