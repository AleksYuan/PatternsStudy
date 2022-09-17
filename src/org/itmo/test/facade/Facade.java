package org.itmo.test.facade;

public class Facade {

    public static void main(String[] args) {

//    если без использования паттерна
        Power power = new Power();
        power.on();

        FlashDrive flashDrive = new FlashDrive();
        flashDrive.load();

        SSD ssd = new SSD();
        ssd .copyFormatFlash(flashDrive);

        System.out.println("============");

//        если с паттерном
        Computer computer = new Computer();
        computer.copy();
    }
}


class Power {
    void on() {
        System.out.println("Power on!");
    }

    void off() {
        System.out.println("Power off!");
    }
}


class FlashDrive {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}


class SSD {
    void copyFormatFlash(FlashDrive flash) {
        if (flash.hasData()) {
            System.out.println("Data is copying...");
        } else  {
            System.out.println("Please, insert a flash.");
        }
    }
}


class Computer {
    Power power = new Power();
    FlashDrive disk = new FlashDrive();
    SSD ssd = new SSD();

    void copy() {
        power.on();
        disk.load();;
        ssd.copyFormatFlash(disk);
    }
}