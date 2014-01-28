package com.windrift.headfirst.command;

public class SimpleRemoteControl {
	Command slot;
	public void setCommand(Command cmd) {
		this.slot = cmd;
	}
	
	public void pressButton() {
		slot.execute();
	}

}
