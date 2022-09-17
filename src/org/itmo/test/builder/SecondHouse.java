package org.itmo.test.builder;

public class SecondHouse  extends Builder{

    public SecondHouse() {
        house = new House();
    }

    @Override
    public House buildHouse() {
        house.buildBase();
        house.buildFloors();
        house.buildWalls();
        return house;
    }
}
