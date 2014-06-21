package com.windrift.com.windrift.designpattern.decorator;

public abstract class Beverage {
	protected String description = "unknown Beverage";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
	
	@Override
	public String toString() {
		return getDescription() + " at price of $" + cost();
	}

}
