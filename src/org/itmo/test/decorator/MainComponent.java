package org.itmo.test.decorator;

public class MainComponent implements Component{

    @Override
    public void doOperation() {
        System.out.println("World!");
    }
}
