package org.itmo.test.decorator;

public class Test {
    public static void main(String[] args) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation();
        c.newOperation();
    }
}
