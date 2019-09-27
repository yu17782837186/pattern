package cn.com.abstractfactory;

public interface Engine {
    //发动机接口
    void run();
    void satrt();
}
class goodEngine implements Engine{
    @Override
    public void run() {
        System.out.println("好的引擎，转的块");
    }

    @Override
    public void satrt() {
        System.out.println("好的引擎，启动快，可以自动启停");
    }
}
class lowEngine implements Engine{
    @Override
    public void run() {
        System.out.println("不好的引擎，转的慢");
    }

    @Override
    public void satrt() {
        System.out.println("不好的引擎，启动慢，不能自动启停");
    }
}