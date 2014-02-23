package com.windrift.headfirst.command.notepad;

public class PastCommand extends Command {
	
	private Notepad notepad;
	private String previousClipboard;
	
	public PastCommand(Notepad notepad) {
		this.notepad = notepad;
	}

	@Override
	void execute() {		
		previousClipboard = notepad.getClipboard();
		System.out.println("Execute Past '" + previousClipboard + "'");
		int pos = notepad.getPos();		
		notepad.getContent().insert(pos, previousClipboard);
		notepad.setPos(pos + previousClipboard.length());
	}

	@Override
	void undo() {
		System.out.println("Undo Past '" + previousClipboard + "'");
		notepad.getContent().delete(notepad.getPos() - previousClipboard.length(), notepad.getPos());
		notepad.setPos(notepad.getPos() - previousClipboard.length());
		previousClipboard = "";
	}

}
