package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Topping extends Ingredient implements Comparable<Topping> {
    public Topping(String aName, double aCost, ArrayList<String> someAllergens) {
        super(aName, aCost, someAllergens);
    }

    @Override
    public int compareTo(Topping o) {
        if (this.getCost() == o.getCost()) {
            return 0;
        } else if (this.getCost() > o.getCost()) {
            return 1;
        } else {
            return -1;
        }
    }
}
