package cn.com.builder;

public class MyAirShipBuilder implements AirShipBuilder{ //StringBuilder类的append()方法,以后学习xml解析中，JDOM库中的类：
    //DomBuilder,SaxBuilder都用到了建造者模式

    @Override
    public Engine builderEngine() {
        System.out.println("建造发动机");
        return new Engine("我的发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("建造轨道舱");
        return new OrbitalModule("我的轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("建造逃脱塔");
        return new EscapeTower("我的逃脱塔");
    }
}
