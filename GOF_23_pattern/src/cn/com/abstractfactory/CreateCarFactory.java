package cn.com.abstractfactory;

public interface CreateCarFactory {
    //工厂接口 里面实现具体的抽象零件
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
class goodCarFactory implements CreateCarFactory {
    @Override
    public Engine createEngine() {
        return new goodEngine();
    }

    @Override
    public Seat createSeat() {
        return new goodSeat();
    }

    @Override
    public Tyre createTyre() {
        return new goodTyre();
    }
}
class lowCarFactory implements CreateCarFactory {
    @Override
    public Engine createEngine() {
        return new lowEngine();
    }

    @Override
    public Seat createSeat() {
        return new lowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new lowTyre();
    }
}