package Composite;

import java.util.ArrayList;

public class Menu extends MenuComponent{
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) { this.menuComponents.add(menuComponent); }

    public void remove(MenuComponent menuComponent) { this.menuComponents.remove(menuComponent); }

    public MenuComponent getChild(int i) { return this.menuComponents.get(i); }

    public String getName() { return this.name; }

    public String getDescription() { return this.description; }

    public void print() {
        System.out.print("\n" + this.getName());
        System.out.println(", " + this.getDescription());
        System.out.println("==========================");

        for (MenuComponent menuComponent : menuComponents) { menuComponent.print(); }
    }
}
