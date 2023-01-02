import Command.*;
import Furniture.CeilingFan;
import Furniture.GarageDoor;
import Furniture.Light;
import Furniture.Stereo;
import RemoteControl.*;

public class Main {
    public static void main(String[] args) {
        /*SimpleRemoteControl remote = new SimpleRemoteControl();
        LightOnCommand lightOn = new LightOnCommand(new Light());
        GarageOpenCommand garageDoor = new GarageOpenCommand(new GarageDoor());

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageDoor);
        remote.buttonWasPressed();*/

        /*RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("거실");
        Light kitchenLight = new Light("주방");
        CeilingFan ceilingFan = new CeilingFan("거실");
        Stereo stereo = new Stereo("거실");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCdCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();*/

        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("거실");

        CeilongFanHighCommand ceilingFanHighCommand = new CeilongFanHighCommand(ceilingFan);
        CeilongFanMediumCommand ceilingFanMediumCommand = new CeilongFanMediumCommand(ceilingFan);
        CeilongFanLowCommand ceilingFanLowCommand = new CeilongFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}