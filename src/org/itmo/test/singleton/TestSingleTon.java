package org.itmo.test.singleton;

public class TestSingleTon {
    public static void main(String[] args) {
//        SingleTon - не можем создать обьъект класса, можем через геттер
        Sun sun = Sun.getSun();
        sun.setSize(123);
        sun.setColor("White");

        Sun sun2 = Sun.getSun();
        sun2.setSize(333);
        sun2.setColor("Yellow");

        System.out.println(sun);
        System.out.println(sun2);
    }
}
