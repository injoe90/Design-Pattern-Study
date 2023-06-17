package Shape;

import Device.Device;
import Device.Phone;
import Device.Watch;

public class Rectangle implements Shape{

    @Override
    public void accept(Device device) {
        device.printTo(this);
    }
}
