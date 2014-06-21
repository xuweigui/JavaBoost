package com.windrift.com.windrift.designpattern.stateAndStrategy;

import java.util.HashMap;
import java.util.Map;

public class GumballMachine {
	private StateBehavior currentStateBehavior;
	
	private Map<State, StateBehavior> allStateBehaviors = new HashMap<State, StateBehavior>();
	
	private int count;
	
	private String location;
	
	public StateBehavior getState(State state) {
		return allStateBehaviors.get(state);
	}
	
	public GumballMachine(int count, String location) {
		allStateBehaviors.put(State.HAS_QUARTER, new HasQuarterStateBehavior(this));
		allStateBehaviors.put(State.NO_QUARTER, new NoQuarterStateBehavior(this));
		allStateBehaviors.put(State.SOLD, new SoldStateBehavior(this));
		allStateBehaviors.put(State.SOLD_OUT, new SoldOutStateBehavior(this));
		
		this.count = count;
		if (this.count > 0) {
			currentStateBehavior = getState(State.NO_QUARTER);
		}
		
		this.location = location;
	}

	public State getCurentState() {
		return currentStateBehavior.getState();
	}
	
	public void setCurrentState(State state) {
		this.currentStateBehavior = getState(state);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Currentstate: " + currentStateBehavior.getState() + ", count = " + count;
	}
	
	
	public void insertQuarter() {
		currentStateBehavior.insertQuarter();
		
	}

	
	public void ejectQuarter() {
		currentStateBehavior.ejectQuarter();
		
	}

	
	public void turnCrank() {
		currentStateBehavior.turnCrank();
		
	}

	
	public void dispense() {
		currentStateBehavior.dispense();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
