package com.epam.sport_shop;

import java.util.ArrayList;

/**
 * Created by hannatarletskaya on 1/25/17.
 */
public class User {
    private String name;
    private double moneyAvailable;
    private int amountOfRentedUnits;
    private ArrayList<SportEquipment> rentedUnits;

    private boolean isEnoughMoney(double price){
        if(getMoneyAvailable() >= price) {
            return true;
        }
        else{
            return false;
        }
    }

//    private boolean isAmountAvailable(SportEquipment unit){
//        if(getAmountOfRentedUnits() < 3) {
//            if(unit.ge)
//            return true;
//        }
//        else{
//            return false;
//        }
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public int getAmountOfRentedUnits() {
        return amountOfRentedUnits;
    }

    public void setAmountOfRentedUnits(int amountOfRentedUnits) {
        this.amountOfRentedUnits = amountOfRentedUnits;
    }

    public ArrayList<SportEquipment> getRentedUnits() {
        return rentedUnits;
    }

    public void setRentedUnits(ArrayList<SportEquipment> rentedUnits) {
        this.rentedUnits = rentedUnits;
    }
}
