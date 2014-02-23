package com.windrift.headfirst.template;

public abstract class CaffeineBeverage {
	public final void prepareRecipe() {
		System.out.println("Preparing " + getName());
		boilWater();
		brew();
		pourInCup();
		if (isCondimentsNeeded()) {
			addCondiments();
		}
		System.out.println("");
	}

	protected abstract String getName();

	protected abstract boolean isCondimentsNeeded();

	protected abstract void addCondiments();

	private void pourInCup() {
		System.out.println("Pour in cup");
		
	}

	protected abstract void brew();

	private void boilWater() {
		System.out.println("Boil water");
		
	}

}
