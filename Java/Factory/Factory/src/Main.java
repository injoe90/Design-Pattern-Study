import Pizza.Pizza;
import PizzaStore.*;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("주문하신 " + pizza.getName() + " 나왔습니다.");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("주문하신 " + pizza.getName() + " 나왔습니다.");
    }
}