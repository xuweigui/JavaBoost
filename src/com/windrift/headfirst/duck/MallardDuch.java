package com.windrift.headfirst.duck;

public class MallardDuch extends Duck{

	public MallardDuch () {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	
	@Override
	void dispaly() {
		//looks like a mallard
	}



}
