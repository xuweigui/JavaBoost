package com.windrift.com.windrift.designpattern.command.notepad;

public class TypeCommand extends Command {

	private Notepad notepad;
	
	private String typeStr;
	
	public TypeCommand(Notepad notepad, String typeStr) {
		this.notepad = notepad;
		this.typeStr = typeStr;
		
	}
	
	@Override
	void execute() {
		System.out.println("Execute " + this);
		int pos = notepad.getPos();		
		notepad.getContent().insert(pos, typeStr);
		notepad.setPos(pos + typeStr.length());
	}


	@Override
	void undo() {
		System.out.println("Unod " + this);
		notepad.getContent().delete(notepad.getPos() - typeStr.length(), notepad.getPos());
		notepad.setPos(notepad.getPos() - typeStr.length());

	}
	
	@Override
	public String toString() {
		return "Type '" + typeStr + "' at pos: " + notepad.getPos(); 
	}

}
