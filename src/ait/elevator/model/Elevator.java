package ait.elevator.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Elevator {
    private String name;
//    private AtomicInteger currentVolume = new AtomicInteger(0);
        private int currentVolume ;

    public Elevator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentVolume() {
        return currentVolume;
//        return  currentVolume.get();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(int portion) {
        currentVolume = currentVolume + portion;
//        currentVolume.addAndGet(portion);
    }
}