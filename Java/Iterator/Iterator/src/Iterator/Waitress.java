package Iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = this.pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = this.dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = this.cafeMenu.createIterator();

        System.out.println("MENU\n----\n아침식사");
        printMenu(pancakeIterator);
        System.out.println("\n점심 식사");
        printMenu(dinerIterator);
        System.out.println("\n저녁 식사");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
