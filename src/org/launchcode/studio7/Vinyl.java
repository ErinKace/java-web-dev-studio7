package org.launchcode.studio7;

public class Vinyl extends BaseDisc implements OpticalDisc {
    public Vinyl(String name) {
        super(name, 0);
    }
    public void spinDisc() {
        System.out.println("The record is spinning");
    }
}
