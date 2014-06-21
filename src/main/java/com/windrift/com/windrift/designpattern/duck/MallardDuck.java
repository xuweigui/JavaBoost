package com.windrift.com.windrift.designpattern.duck;

public class MallardDuck extends Duck{

	public MallardDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	
	@Override
	void display() {
		//looks like a mallard
	}



}
