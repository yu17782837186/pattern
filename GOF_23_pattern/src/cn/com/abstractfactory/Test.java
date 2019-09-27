package cn.com.abstractfactory;

public class Test {
    public static void main(String[] args) {
        //测试抽象工厂模式
        CreateCarFactory c1 = new goodCarFactory();
        CreateCarFactory c2 = new lowCarFactory();
        Engine engine = c1.createEngine();
        engine.run();
        engine.satrt();
        Engine engine1 = c2.createEngine();
        engine1.satrt();
        engine1.run();
        //抽象工厂模式，不可以增加产品，可以增加产品族
    }
}
