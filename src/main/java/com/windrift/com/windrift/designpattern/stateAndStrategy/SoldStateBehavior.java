package com.windrift.com.windrift.designpattern.stateAndStrategy;

public class SoldStateBehavior extends StateBehavior {
	public SoldStateBehavior(GumballMachine gumballMachine) {
		super(gumballMachine);
		state = State.SOLD;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait. We're already giving you a gumball");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Turnning twice doesn't get you another gumball");
		
	}

	@Override
	public void dispense() {
		System.out.println("A gumball come rolling out the slot");
		GumballMachine machine = getMachine();
		machine.setCount(machine.getCount() - 1);
		if (machine.getCount() == 0 ) {
			System.out.println("Oops, out of gumballs");
			machine.setCurrentState(State.SOLD_OUT);
		} else {
			machine.setCurrentState(State.NO_QUARTER);
		}
		
	}
	@Override
	public void refill(int count) {
		System.out.println("You can't refill until there is no gumball in the machine");	
	}
	
}
