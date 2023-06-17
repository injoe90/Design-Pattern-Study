package Shape;

import Device.Device;
import Device.Phone;
import Device.Watch;

public class Triangle implements Shape{

    @Override
    public void accept(Device device) {
        device.printTo(this);
    }
}
