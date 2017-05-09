package com.windrift.designpattern.decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage b = new HouseBlend();
		System.out.println(b);
		b = new Milk(b);		
		System.out.println(b);
		
		Beverage c = new Espresso();
		System.out.println(c);
		c = new Mocha(c);
		System.out.println(c);
		c = new Milk(c);
		System.out.println(c);
		
	}

}
