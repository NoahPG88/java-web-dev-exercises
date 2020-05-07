package org.launchcode.java.restaurantmenu;
import java.util.ArrayList;
    public class Main {
        public static void main(String[] args) {
            MenuItem burger = new MenuItem(28.00, "best burger ever", "entree");
            System.out.println(burger.getDateAdded());
            Menu mainMenu = new Menu();
            System.out.println(mainMenu.getLastUpdated());
            mainMenu.setAppetizer(burger);
//        System.out.println(mainMenu.getAppetizer());
            for (MenuItem item: mainMenu.appetizer) {
                System.out.println(item.getDescription());
            }
        }
    }

