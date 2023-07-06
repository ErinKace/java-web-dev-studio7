package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){


        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Cool CD", new ArrayList<>(Arrays.asList("Chapter One", "Chapter Two", "Chapter Three")));
        DVD myDVD = new DVD("Cool DVD", 4000, new ArrayList<>(Arrays.asList("Track One", "Track Two", "Track Three")));

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myDVD.spinDisc();
        myCD.playDisk();
        myDVD.pauseDisk();

    }
}
