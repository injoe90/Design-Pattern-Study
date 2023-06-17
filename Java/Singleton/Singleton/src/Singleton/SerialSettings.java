package Singleton;

import java.io.Serializable;

public class SerialSettings implements Serializable {
    private SerialSettings() {}

    private static class SettingsHolder {
        private static final SerialSettings INSTANCE = new SerialSettings();
    }

    public static SerialSettings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /*
    * 역직렬화를 시도할 때 반드시 사용하는 메서드
    * */
    /*protected Object readResolve() {
        return getInstance();
    }*/
}
