package Command;

public interface Command {
    public void execute();

    default void undo() {

    }
}
