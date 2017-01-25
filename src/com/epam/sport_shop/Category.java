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

    public boolean equals(Object obj) {
        System.out.println("POPOP");
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Category other = (Category) obj;
        if (!category.equals(other.category)) {
            return false;
        }
        return true;

    }


    @Override
    public String toString() {
        return getCategory();
    }
}
