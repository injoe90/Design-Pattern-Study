import Duck.*;
import Fly.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck modelDuck = new ModelDuck();

        /* mallardDuck */
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.display();

        System.out.println("=================================");

        /* modelDuck */
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.display();
    }
}
