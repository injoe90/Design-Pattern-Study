package Device;

import Shape.Circle;
import Shape.Rectangle;
import Shape.Triangle;

public interface Device {
    void printTo(Circle circle);

    void printTo(Rectangle rectangle);

    void printTo(Triangle triangle);
}
