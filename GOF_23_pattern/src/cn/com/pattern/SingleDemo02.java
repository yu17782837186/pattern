package cn.com.pattern;

public class SingleDemo02 {
    //延迟加载，懒加载，用的时候才加载
    //问题：资源利用率高了，但是每次调用getInstance方法都需要同步，并发的效率低

    //类初始化时，不初始化这个对象（延时加载，真正用的时候在创建）
    private static SingleDemo02 instance;
    private SingleDemo02() {//私有化构造器

    }
    //方法同步，调用效率低
    public static synchronized SingleDemo02 getInstance() {
        if (instance == null) {
            instance = new SingleDemo02();
        }
        return instance;
    }
}
