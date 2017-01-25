package com.epam.sport_shop;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.ArrayList;

public class RentUnit {
	private Map<String, ArrayList<SportEquipment>> goodsRentedByUsers = new HashMap<>();
	private ArrayList<SportEquipment> units;

	private void userName(String name){

	}

	private void addPosition(SportEquipment position) {
		units.add(position);
	}

	private void rent(String name, ArrayList<SportEquipment> positions){

		goodsRentedByUsers.put(name, positions);
	}

	public RentUnit(ArrayList<SportEquipment> units) {

		this.units = units;
	}

	public ArrayList<SportEquipment> getUnits() {

		return units;
	}

	public void setUnits(ArrayList<SportEquipment> units) {

		this.units = units;
	}
}
