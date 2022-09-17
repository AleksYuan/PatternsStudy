package org.itmo.test.builder;

public class Building {
    private Builder builder;

    public Building() {
        builder = new FirstHouse();
    }

    public House buildHouse() {
        return builder.buildHouse();
    }

    public static void main(String[] args) {
        House house = new Building().buildHouse();

    }
}
