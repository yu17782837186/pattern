package cn.com.pattern;

public enum SingleDemo05 {
    //使用枚举实现单例模式
    //实现简单 枚举本身就是单例模式，JVM从根本上提供保障，避免了
    //通过反射和反序列化的漏洞
    //缺点： 没有延时加载

    //这个枚举元素，本身就是单例对象
    INSTANCE;

    //添加需要的操作
    public void singleOperation() {

    }
}
