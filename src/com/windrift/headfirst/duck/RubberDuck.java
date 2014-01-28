package com.windrift.headfirst.duck;

public class RubberDuck extends Duck {

	public RubberDuck () {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Squeak();
	}
	
	@Override
	void dispaly() {
		System.out.println("I am a rubber duck");
		
	}
	
}
