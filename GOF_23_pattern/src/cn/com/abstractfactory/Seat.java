package cn.com.abstractfactory;

public interface Seat {
    //座椅接口
    void action();
}
class goodSeat implements Seat{
    @Override
    public void action() {
        System.out.println("好的座椅，支持自动按摩");
    }
}
class lowSeat implements Seat {
    @Override
    public void action() {
        System.out.println("不好的座椅，不支持自动按摩");
    }
}
