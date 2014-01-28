package com.windrift.gof.abstractfactory;

public class Client {
	
	private static AbstractFactory factory;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractProductA productA = factory.produceProductA(); 

	}

}
