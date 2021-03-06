package com.windrift.designpattern.duck;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	void performFly() {
		this.flyBehavior.fly();
	}
	
	void performQuack() {
		this.quackBehavior.quack();
	}
	
	
	void swim() {
		System.out.println("Swimming");
	}
	

	abstract void display();

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
