package cn.com.factorymethod;

public class Test {
    //测试工厂方法模式
    public static void main(String[] args) {
        Car c1 = new AudiFactory().creatCar();
        Car c2 = new BydFactory().creatCar();
        Car c3 = new BenzFactory().creatCar();
        c1.run();
        c2.run();
        c3.run();
        //满足了ocp原则（开闭原则）
        //增加新的类需要修建新的工厂，增加了代码量，当同时需要修改多个工厂类的时候
        ///会很麻烦，而简单工厂模式只需要修改唯一的工厂类
        //工厂方法模式就是升级版的简单工厂模式
    }
}
