package com.windrift.designpattern.command.notepad;

public class CopyCommand extends Command {
	
	private Notepad notepad;
	private String previousClipboard = "";
	private String copyStr;
	
	public CopyCommand(Notepad notepad, String copyStr) {
		this.notepad = notepad;
		this.copyStr = copyStr;
	}

	@Override
	void execute() {
		System.out.println("Execute Copy '" + copyStr + "'");
		previousClipboard = notepad.getClipboard();
		notepad.setClipboard(copyStr);
	}

	@Override
	void undo() {
		System.out.println("Undo Copy '" + copyStr + "'");
		notepad.setClipboard(previousClipboard);
		previousClipboard = "";
	}

}
