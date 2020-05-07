package org.launchcode.java.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;
public class Menu {
    ArrayList<MenuItem> appetizer = new ArrayList<>();
    ArrayList<MenuItem> mainCourse = new ArrayList<>();
    ArrayList<MenuItem> dessert = new ArrayList<>();
    private Date lastUpdated = new Date();


    public Date getDateItemUpdated(MenuItem aMenuItem){
        return aMenuItem.getDateAdded();
    }

    public Boolean isMenuItemNew(MenuItem aMenuItem){
        Date todaysDate = new Date();
       // if(aMenuItem.getDateAdded() - todaysDate < 7){
         //   return true;
       // }
        return  false;
    }

    public void setLastUpdated() {
        this.lastUpdated = new Date();
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }


    protected void setAppetizer(MenuItem aMenuItem) {
        this.appetizer.add(aMenuItem);
        setLastUpdated();
    }

    public void removeAppetizer(MenuItem aMenuItem){
        this.appetizer.remove(aMenuItem);
    }

    public ArrayList<MenuItem> getAppetizer() {
        return appetizer;
    }

    public ArrayList<MenuItem> getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MenuItem mainCourse) {
        this.mainCourse.add(mainCourse);
    }

    public void removeMainCourse(MenuItem aMenuItem){
        this.mainCourse.remove(aMenuItem);
    }

    public ArrayList<MenuItem> getDessert() {
        return dessert;
    }

    public void setDessert(MenuItem dessert) {
        this.dessert.add(dessert);
    }
    public void removeDessert(MenuItem aMenuItem){
        this.dessert.remove(aMenuItem);
    }
}