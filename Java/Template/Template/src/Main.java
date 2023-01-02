import Drink.*;

public class Main {
    public static void main(String[] args) {
        /*Tea myTea = new Tea();
        Coffee myCoffee = new Coffee();

        myTea.prepareRecipe();
        myCoffee.prepareRecipe();*/

        TeaWithHook myTea = new TeaWithHook();
        CoffeeWithHook myCoffee = new CoffeeWithHook();

        myTea.prepareRecipe();
        myCoffee.prepareRecipe();
    }
}