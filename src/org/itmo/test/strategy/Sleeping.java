package org.itmo.test.strategy;

public class Sleeping implements Activity{
    @Override
    public void work() {
        System.out.println("Sleeping....");
    }
}
