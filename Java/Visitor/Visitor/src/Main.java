import Device.*;
import Shape.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Phone();

        rectangle.accept(device);
    }
}