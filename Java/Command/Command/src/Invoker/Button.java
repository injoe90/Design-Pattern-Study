package Invoker;

import Command.*;

import java.util.Stack;

public class Button {
    private Command command;
    
    private Stack<Command> commandStack = new Stack<>();

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        commandStack.push(command);
        command.execute();
    }
    
    public void undo() {
        if (!commandStack.isEmpty()) {
            Command commandUndo = commandStack.pop();
            commandUndo.undo();
        }
    }
}
