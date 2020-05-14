package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        Comparator comparator = new FlavorComparator();
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
//        for (Flavor flavor : flavors){
//            System.out.println(flavor.getName());
//        };

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
//        for (Cone cone : cones){
//            System.out.println(cone.getCost());
//        };

        cones.sort(new ConeComparator());

//        for (Cone cone : cones){
//            System.out.println(cone.getCost());
//        };

        // Bonus sort by number of allergens

        flavors.sort(new FlavorAllergenComparator());
        for (Flavor flavor: flavors
             ) {
            //System.out.println(flavor.getAllergens());
        }
        //System.out.println(flavors.toString());

        //Bonus sort toppings
        toppings.sort(new ToppingComparator());
        System.out.println(toppings.toString());
    }
}
