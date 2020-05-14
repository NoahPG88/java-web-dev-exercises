package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorAllergenComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        if(o1.getAllergens().size() > o2.getAllergens().size()){
            return 1;
        } else if (o1.getAllergens().size() == o2.getAllergens().size()){
            return 0;
        } else {
            return -1;
        }
    }
}
