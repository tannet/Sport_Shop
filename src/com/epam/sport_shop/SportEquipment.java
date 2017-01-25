package com.epam.sport_shop;

public class SportEquipment {
    private Category category;
    private String title;
    private int price;

    SportEquipment(String[] s) {
        this.category = new Category(s[0]);
        this.title = s[1];
        this.price = Integer.parseInt(s[2]);
    }


    public void setCaregory(Category caregory) {
        this.category = caregory;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {

        this.title = title;
    }


    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public boolean equals(Object obj) {
        System.out.println("ER");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SportEquipment other = (SportEquipment) obj;
        if (!category.equals(other.category))
            return false;
        if (title != other.title)
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return (getCategory() + " " + getTitle() + " " + getPrice());
    }
}
