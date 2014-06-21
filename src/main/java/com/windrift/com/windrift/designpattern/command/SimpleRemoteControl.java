package com.windrift.com.windrift.designpattern.command;

public class SimpleRemoteControl {
	Command slot;
	public void setCommand(Command cmd) {
		this.slot = cmd;
	}
	
	public void pressButton() {
		slot.execute();
	}

}
