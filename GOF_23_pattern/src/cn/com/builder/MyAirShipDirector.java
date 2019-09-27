package cn.com.builder;

public class MyAirShipDirector implements AirShipDirector{
    private AirShipBuilder builder;//用来获得构建对象的引用

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }
    //组装者调用了建造者，通过建造者获得组件，然后组装者进行组装
    @Override
    public AirShip createAirShip() {
        Engine e = builder.builderEngine();
        EscapeTower et = builder.builderEscapeTower();
        OrbitalModule o = builder.builderOrbitalModule();
        //组装成飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitaModule(o);
        return ship;
    }
}
