package org.launchcode.java.restaurantmenu;

import java.util.Date;
public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private final Date dateAdded;
    public MenuItem(Double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = new Date();
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    protected Date getDateAdded() {
        return dateAdded;
    }
}
