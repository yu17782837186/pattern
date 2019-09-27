package cn.com.simplefactory;


import cn.com.simplefactory.Car;

public class Test1 { //调用者
    public static void main(String[] args) {
        //测试没有工厂模式的情况下
        Car c1 = new Audi();
        Car c2 = new Byd();
        c1.run();
        c2.run();
    }
}
