package Command;

import Furniture.GarageDoor;

public class GarageOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {

    }
}
