package com.windrift.com.windrift.designpattern.duck;

public class RedheadDuck extends Duck{

	public RedheadDuck () {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	
	@Override
	void dispaly() {
		// looks like red head
	}



}
