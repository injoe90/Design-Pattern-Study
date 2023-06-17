package PropertyChange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class User implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getNewValue());
    }
}
