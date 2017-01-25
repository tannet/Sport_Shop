package com.epam.sport_shop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Shop {
    private Map<SportEquipment, Integer> goods; // Integer - amount of goods in this category
    private Map<SportEquipment, Integer> rentedGoods = new HashMap<>(); // positions which was rented

    private BufferedReader input;

    Shop() {
        goodsInitialization();
    }

    public Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    private void goodsInitialization() {
        try {
            input = new BufferedReader(new FileReader("goods.txt"));
            goods = new HashMap<>();
            String line = null;
            while ((line = input.readLine()) != null) {
                String[] columns = line.split(" ");
                SportEquipment s = new SportEquipment(columns);
                goods.put(s, Integer.parseInt(columns[3]));
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR. File not found. Please check the directory.");
        } catch (IOException e) {
            System.err.println("ERROR. Line can't be read. Check your file.");
        } catch (NumberFormatException e) {
            System.err.println("ERROR. Amount parameter (the 4th one) can not be converted to Integer. Check your file.");
        }
    }

    ArrayList<SportEquipment> itemsRentedByUser = new ArrayList<>();

    // RENTING MODULES IN THE SHOP
    public void rentTheItem(Map items, SportEquipment itemToRent) {
        System.out.println(items.containsKey(itemToRent));
        //System.out.println(itemToRent.getCategory());
//        if(goods.get(itemToRent) > 0){
//            itemsRentedByUser.add(itemToRent);
//            goods.get(itemToRent) = Integer.parseInt()
//        }
    }



    public void returnTheItem(Map items, SportEquipment itemToReturn) {
        //int i = Integer.parseInt(items.get(itemToReturn));
    }


    // PRINTING OF GOODS IN THE SHOP
    public void printFreeGoodsList() {
        System.out.println("Free Sport Equipment:");
        for (Entry<SportEquipment, Integer> entry : goods.entrySet()) {
            //System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println("Key: " + entry.getKey() + "    ||    Value: " + entry.getValue());
        }
        System.out.println(" SIZE: " + goods.size());
    }

    public void printRentedGoodsList() {
        System.out.println("Rented Sport Equipment:");
        for (Entry<SportEquipment, Integer> entry : rentedGoods.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(" SIZE: " + rentedGoods.size());
    }

}
