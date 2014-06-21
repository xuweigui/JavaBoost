package com.windrift.com.windrift.designpattern.command.notepad;

import java.util.Stack;

public class Notepad {
	private StringBuilder content;
	private int pos; //current cursor position
	private Stack<Command> executedCommands;//commands that have been executed
	private Stack<Command> undoCommands;//commands that have been undo'ed
	
	private String clipboard;
	
	public Notepad () {
		content = new StringBuilder();
		pos = 0;
		executedCommands = new Stack<Command>();
		undoCommands = new Stack<Command>();
	}
	
	public void execute(Command command) {
		command.execute();
		executedCommands.push(command);
	}
	
	public void redo () {
		if (!undoCommands.isEmpty()) {
			Command command = undoCommands.pop();
			command.execute();
			executedCommands.push(command);
		}
	}
	
	public void undo() {
		if (!executedCommands.isEmpty()) {
			Command command = executedCommands.pop();
			command.undo();
			undoCommands.push(command);
		}
	}

	public StringBuilder getContent() {
		return content;
	}

	public void setContent(StringBuilder content) {
		this.content = content;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public Stack<Command> getCommands() {
		return executedCommands;
	}

	public void setCommands(Stack<Command> commands) {
		this.executedCommands = commands;
	}
	
	
	
	
	public String getClipboard() {
		return clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
	}

	public void print() {
		System.out.println("***** Content: " + content);
//		System.out.println("pos: " + pos);
//		System.out.println("Commands: ");
//		for (Command cmd : executedCommands) {
//			System.out.println(cmd);
//		}
	}
	
	
	
	public static void main (String[] args) {
		Notepad notepad = new Notepad();
		Command type1 = new TypeCommand(notepad, "abc");
		Command type2 = new TypeCommand(notepad, "gg");
		
		notepad.execute(type1);
		
		notepad.print();
		
		notepad.execute(type2);
		
		notepad.print();
		
		notepad.undo();
		
		notepad.print();
		
		notepad.undo();
		notepad.undo();
		
		notepad.print();
		
		notepad.redo();
		notepad.print();
		
		notepad.redo();
		notepad.redo();
		notepad.print();
		
		
		Command copy = new CopyCommand(notepad, "copy str");
		notepad.execute(copy);
		notepad.print();
		
		Command past = new PastCommand(notepad);
		notepad.execute(past);
		notepad.print();
		
		notepad.undo();
		notepad.print();
		notepad.undo();
		
		notepad.redo();
		notepad.redo();
		notepad.print();
	}
	
}
