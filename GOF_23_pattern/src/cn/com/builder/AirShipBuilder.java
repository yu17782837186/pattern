package cn.com.builder;

public interface AirShipBuilder {
    //构建子组件
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
