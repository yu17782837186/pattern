package cn.com.simplefactory;

public interface Car {
    void run();
}

class Audi implements Car {
    @Override
    public void run() {
        System.out.println("奥迪在跑");
    }
}

class Byd implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪在跑");
    }
}