package cn.com.factorymethod;

public class BenzFactory implements CarFactory{
    @Override
    public Car creatCar() {
        return new Benz();
    }
}
