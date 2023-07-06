package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    private ArrayList<String> trackNames;

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public CD(String name, ArrayList<String> trackNames) {
        super(name, 700);
        this.trackNames = trackNames;
        for (String track : trackNames) {
            setActualCapacity(getActualCapacity()+10);
        }
    }
    @Override
    public void spinDisc() {
        System.out.println("This CD spins SLOW");
    }

}
