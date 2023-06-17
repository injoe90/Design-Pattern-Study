import Component.Bag;
import Component.Component;
import Component.Item;

public class Main {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란 검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.setComponents(doranBlade);
        bag.setComponents(healPotion);

        printPrice(doranBlade);
        printPrice(healPotion);
        printPrice(bag);
    }

    public static void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}