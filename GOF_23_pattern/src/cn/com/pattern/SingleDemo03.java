package cn.com.pattern;

public class SingleDemo03 {
    //静态内部类实现单例，也是一种懒加载方式
    //外部类没有static属性，不会像饿汉式那样立即加载对象 实现了延时加载
    //只有真正调用了getInstance()，才会加载并初始化静态内部类，加载类时线程是安全的
    //具有并发高效调用和延时加载的优势
//    private static class SingleClass {
//        private static SingleDemo03 instance = new SingleDemo03();
//    }
//    private SingleDemo03() {
//
//    }
//    public static SingleDemo03 getInstance() {
//        return SingleClass.instance;
//    }
    private static class SingleClass {
        private static SingleDemo03 instance = new SingleDemo03();
    }
    private SingleDemo03() {

    }
    public static SingleDemo03 getInstance() {
        return SingleClass.instance;
    }
}
