package org.itmo.test.prototype;

import java.util.Map;

public class PhoneBook implements Copyable{
    private Map<String, Long> namesAndNums;

    public PhoneBook(Map<String, Long> namesAndNums) {
        this.namesAndNums = namesAndNums;
    }

    public void setNamesAndNums(Map<String, Long> namesAndNums) {
        this.namesAndNums = namesAndNums;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "namesAndNums=" + namesAndNums +
                '}';
    }

    @Override
    public Object copy() {
        return new PhoneBook(this.namesAndNums);
    }

//    то же что и object copy можно сделать через клон
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
