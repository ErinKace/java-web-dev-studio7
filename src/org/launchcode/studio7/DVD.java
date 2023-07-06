package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {
    private ArrayList<String> chapterTitles;

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String name, int maxCapacity, ArrayList<String> chapterTitles) {
        super(name,maxCapacity);
        this.chapterTitles = chapterTitles;
        for (String chapterTitle : chapterTitles) {
            setActualCapacity(getActualCapacity()+10);
        }
    }
    @Override
    public void spinDisc() {
        System.out.println("This DVD spins FAST");
    }

}
