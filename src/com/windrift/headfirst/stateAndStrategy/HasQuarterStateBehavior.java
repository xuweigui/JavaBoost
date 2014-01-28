package com.windrift.headfirst.stateAndStrategy;

public class HasQuarterStateBehavior extends StateBehavior {
	public HasQuarterStateBehavior(GumballMachine gumballMachine) {
		super(gumballMachine);
		state = State.HAS_QUARTER;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		machine.setCurrentState(State.NO_QUARTER);
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		machine.setCurrentState(State.SOLD);
		machine.getState(State.SOLD).dispense();
		
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
		
	}
	@Override
	public void refill(int count) {
		System.out.println("You can't refill until there is no gumball in the machine");	
	}
}
