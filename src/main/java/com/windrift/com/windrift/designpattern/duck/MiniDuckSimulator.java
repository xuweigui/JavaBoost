package com.windrift.com.windrift.designpattern.duck;

public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck redhead = new RedheadDuck();
		redhead.dispaly();
		redhead.performFly();
		redhead.performQuack();
		redhead.swim();

	}

}
