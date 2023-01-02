package Command;

import Furniture.CeilingFan;

public class CeilongFanHighCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilongFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (this.prevSpeed) {
            case CeilingFan.HIGH -> { this.ceilingFan.high(); }
            case CeilingFan.MEDIUM -> { this.ceilingFan.medium(); }
            case CeilingFan.LOW -> { this.ceilingFan.low(); }
            case CeilingFan.OFF -> { this.ceilingFan.off(); }
        }
    }
}
