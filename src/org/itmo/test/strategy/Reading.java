package org.itmo.test.strategy;

public class Reading implements Activity {
    @Override
    public void work() {
        System.out.println("Reading...");
    }
}
