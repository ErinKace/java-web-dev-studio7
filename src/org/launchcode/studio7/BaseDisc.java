package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int maxCapacity;
    private int actualCapacity;

    public BaseDisc(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.actualCapacity = 0;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActualCapacity(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    public void playDisk() {
        System.out.println("Playing Media");
    }
    public void pauseDisk() {
        System.out.println("Paused Media");
    }
}
