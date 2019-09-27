package cn.com.builder;

public class Test {
    public static void main(String[] args) {
        AirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());
        AirShip ship = director.createAirShip();
        System.out.println(ship.getEngine().getName());
    }
}
