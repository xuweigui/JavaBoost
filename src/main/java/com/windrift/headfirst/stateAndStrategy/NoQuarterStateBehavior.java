package com.windrift.headfirst.stateAndStrategy;

public class NoQuarterStateBehavior extends StateBehavior {
	
	public NoQuarterStateBehavior(GumballMachine machine) {
		super(machine);
		this.state = State.NO_QUARTER;
	}

	@Override
	public void insertQuarter() {
		machine.setCurrentState(State.HAS_QUARTER);
		System.out.println("You just inserted a quarter");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't insert a quarter yet");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there is no quarter");
		
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
		
	}
	@Override
	public void refill(int count) {
		System.out.println("You can't refill until there is no gumball in the machine");	
	}

}
