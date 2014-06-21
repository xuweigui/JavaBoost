package com.windrift.com.windrift.designpattern.stateAndStrategy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GumballMachine machine = new GumballMachine(3, "Sydney");
		GumballMachine machine2 = new GumballMachine(6, "Melbourne");
		System.out.println(machine);
		System.out.println(machine2);
		
		machine.ejectQuarter();
		System.out.println(machine);
		machine.dispense();
		System.out.println(machine);
		machine.insertQuarter();
		System.out.println(machine);
		machine.dispense();
		System.out.println(machine);
		machine.ejectQuarter();
		System.out.println(machine);
		machine.insertQuarter();
		System.out.println(machine);
		machine.turnCrank();
		System.out.println(machine);
		machine.dispense();
		System.out.println(machine);
		System.out.println(machine2);
		
		
	}

}
