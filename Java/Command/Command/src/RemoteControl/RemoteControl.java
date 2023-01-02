package RemoteControl;

import Command.*;

public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;
    Command undoCommand;
    public RemoteControl() {
        this.onCommand = new Command[7];
        this.offCommand = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand; offCommand[i] = noCommand;
        }

        this.undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand; this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommand[slot].execute();
        this.undoCommand = this.onCommand[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommand[slot].execute();
        this.undoCommand = this.offCommand[slot];
    }

    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------------- 리모컨 -------------\n");
        for (int i = 0; i < onCommand.length; i++) {
            stringBuffer.append("[slot " + i + "] " + this.onCommand[i].getClass().getName()
            + "    " + this.offCommand[i].getClass().getName() + "\n");
        }

        return stringBuffer.toString();
    }
}
