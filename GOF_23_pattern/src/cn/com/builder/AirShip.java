package cn.com.builder;

public class AirShip {
    //宇宙飞船的三个子组件，用类来模拟
    private OrbitalModule orbitaModule;//轨道舱
    private Engine engine;//发动机
    private EscapeTower escapeTower;//逃生塔

    public OrbitalModule getOrbitaModule() {
        return orbitaModule;
    }

    public void setOrbitaModule(OrbitalModule orbitaModule) {
        this.orbitaModule = orbitaModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class EscapeTower {
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
