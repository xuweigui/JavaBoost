package com.windrift.designpattern.stateAndStrategy;

public class GumballMonitor {
	private GumballMachine machine;
	public GumballMonitor (GumballMachine machine) {
		this.machine = machine;
	}
	
	public void report() {
		System.out.println("Gumball Machine: " + machine.getLocation());
		System.out.println("Current Inventory: " + machine.getCount() + " gumballs");
		System.out.println("Current State: " + machine.getCurrentState());
	}
}
