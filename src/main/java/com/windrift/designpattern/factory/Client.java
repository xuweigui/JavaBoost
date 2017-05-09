package com.windrift.designpattern.factory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore = new NYPizzaStore();
		nyStore.orderPizza("cheese");

	}

}
