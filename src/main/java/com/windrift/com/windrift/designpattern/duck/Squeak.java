package com.windrift.com.windrift.designpattern.duck;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak, squeak, squeak...");
		
	}

}
