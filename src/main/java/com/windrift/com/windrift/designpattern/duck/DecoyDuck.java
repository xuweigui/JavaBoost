package com.windrift.com.windrift.designpattern.duck;

public class DecoyDuck extends Duck{

	public DecoyDuck () {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new MuteQuack();
	}
	@Override
	void display() {
		// looks like Decoy Duck
		
	}

}
