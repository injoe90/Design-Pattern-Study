import Singleton.Settings;
import Singleton.enumSettings;

public class EnumApp {
    public static void main(String[] args) {
        enumSettings settings = enumSettings.INSTANCE;

        System.out.println(settings);
    }
}
