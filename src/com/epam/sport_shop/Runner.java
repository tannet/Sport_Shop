package com.epam.sport_shop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		Shop shopItems = new Shop();
		//shopItems.printFreeGoodsList();
		//shopItems.printRentedGoodsList();

		//RENT TESTING
		User user = new User();
		String[] userWannaThisItem = new String[] {"Skiing",  "Skiboots",  "80"}; // Lets make smth to give the user ability to make a choise :)
		SportEquipment example = new SportEquipment(userWannaThisItem);
		shopItems.rentTheItem(shopItems.getGoods(), example);
		//shopItems.printRentedGoodsList();
		///////shopItems.itemsRentedByUser;
	}
}
