package com.windrift.designpattern.template;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe();
		CaffeineBeverage tea = new Tea();
		tea.prepareRecipe();
		

	}

}
