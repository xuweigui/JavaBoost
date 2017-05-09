package com.windrift.designpattern.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light();
		Command lightOnCommand = new LightOnCommand(light);
		remoteControl.setCommand(lightOnCommand);
		remoteControl.pressButton();
		

	}

}
