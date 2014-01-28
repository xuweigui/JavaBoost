package com.windrift.headfirst.stateAndStrategy;

public abstract class StateBehavior {
	
		
	protected State state;

	
	protected GumballMachine machine;
	
	public StateBehavior (GumballMachine machine) {
		this.machine = machine;
	}
	
	public abstract void insertQuarter();
	
	public abstract void ejectQuarter();
	
	public abstract void turnCrank();
	
	public abstract void dispense();
	
	public abstract void refill(int count);

	public GumballMachine getMachine() {
		return machine;
	}

	public void setMachine(GumballMachine machine) {
		this.machine = machine;
	}

	public State getState() {
		return state;
	}
	

}