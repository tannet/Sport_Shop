package com.epam.sport_shop;

public class Runner {

	public static void main(String[] args) {
		Shop shopItems = new Shop();
		//shopItems.printFreeGoodsList();
		//shopItems.printRentedGoodsList();

		//RENT TESTING
		String[] userWanna = new String[] {"Skiing ",  "Skiboots",  "80"};
		SportEquipment s1 = new SportEquipment(userWanna);
		SportEquipment s2 = new SportEquipment(userWanna);
		//System.out.println(s1.equals(s2));

		shopItems.rentTheItem(shopItems.getGoods(), s1);
	}

}
