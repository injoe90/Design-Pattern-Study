import Singleton.SerialSettings;

import java.io.*;

public class SerialApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerialSettings settings = SerialSettings.getInstance();
        SerialSettings settings1 = null;

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (SerialSettings) in.readObject();
        }

        System.out.println(settings == settings1);
    }
}
