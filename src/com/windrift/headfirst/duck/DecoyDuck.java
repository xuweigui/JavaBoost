package com.windrift.headfirst.duck;

public class DecoyDuck extends Duck{

	public DecoyDuck () {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new MuteQuack();
	}
	@Override
	void dispaly() {
		// looks like Decoy Duck
		
	}

}
