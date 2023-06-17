package Component;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{
    private List<Component> components = new ArrayList<Component>();

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(Component components) {
        this.components.add(components);
    }

    @Override
    public int getPrice() {
        return this.components.stream().mapToInt(Component::getPrice).sum();
    }
}
