package cn.com.simplefactory;


import cn.com.simplefactory.Car;

public class CarFactory {
    public static Car createCar(String name) {
        if ("奥迪".equals(name)) {
            return new Audi();
        }else if ("比亚迪".equals(name)) {
            return new Byd();
        }else {
            return null;
        }
    }

//    public static Car createAudi() {
//        return new Audi();
//    }
//    public static Car createByd() {
//        return new Byd();
//    }
}
