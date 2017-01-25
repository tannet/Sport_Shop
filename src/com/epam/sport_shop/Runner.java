package com.epam.sport_shop;

public class Runner {

	public static void main(String[] args) {
		Shop shopItems = new Shop();
		//shopItems.printFreeGoodsList();
		//shopItems.printRentedGoodsList();

		//RENT TESTING
		String[] userWanna = new String[] {"Badminton",  "Shuttlecock",  "5"};
		SportEquipment s = new SportEquipment(userWanna);
		//System.out.println(s);

		shopItems.rentTheItem(s);
	}

}
