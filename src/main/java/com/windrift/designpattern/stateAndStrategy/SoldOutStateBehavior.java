package com.windrift.designpattern.stateAndStrategy;

public class SoldOutStateBehavior extends StateBehavior {
	
	public SoldOutStateBehavior(GumballMachine gumballMachine) {
		super(gumballMachine);
		state = State.SOLD_OUT;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't insert a quarter yet");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there are no gumballs");
		
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
		
	}

	@Override
	public void refill(int count) {
		System.out.println("Refilling " + count + " gumballs");
		machine.setCount(count);
		machine.setCurrentState(State.NO_QUARTER);			
		
	}

}
