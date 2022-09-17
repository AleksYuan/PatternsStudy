package org.itmo.test.decorator;

public class DecoratorHello extends Decorator{

    public DecoratorHello(Component c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print("Hello");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New Hello operation");
    }
}
