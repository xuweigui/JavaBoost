package com.windrift.com.windrift.designpattern.duck;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying with wings");
	}

}
