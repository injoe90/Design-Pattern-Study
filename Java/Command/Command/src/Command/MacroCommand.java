package Command;

public class MacroCommand implements Command{
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : this.commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {

    }
}
