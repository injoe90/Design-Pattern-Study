package PropertyChange;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Subject {
    PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void addObserver(PropertyChangeListener observer) {
        support.addPropertyChangeListener(observer);
    }

    public void removeObserver(PropertyChangeListener observer) {
        support.removePropertyChangeListener(observer);
    }

    public void add(String message) {
        support.firePropertyChange("eventName", null, message);
    }
}
