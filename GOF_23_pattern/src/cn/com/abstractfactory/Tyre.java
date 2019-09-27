package cn.com.abstractfactory;

public interface Tyre {
    //轮胎接口
    void revolve(); //旋转
}
class goodTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("好的轮胎，轮胎损耗小");
    }
}
class lowTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("不好的轮胎轮胎损耗大");
    }
}
