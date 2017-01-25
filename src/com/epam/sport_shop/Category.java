package com.epam.sport_shop;

public class Category {
    private String category;

    Category(String category) {
        setCategory(category);
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    @Override
    public String toString() {
        return getCategory();
    }
}
