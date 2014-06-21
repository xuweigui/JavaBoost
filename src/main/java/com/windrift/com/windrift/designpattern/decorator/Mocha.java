package com.windrift.com.windrift.designpattern.decorator;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;
	
	public Mocha (Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {		
		return .6 + beverage.cost();
	}

	@Override
	public String getDescription() {		
		return this.beverage.description + ", Mocha";
	}

}
