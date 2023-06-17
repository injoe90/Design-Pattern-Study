import Adapter.DuckAdapter;
import Decorator.QuackCounter;
import Duck.Goose;
import Duck.Quackable;
import Factory.AbstractDuckFactory;
import Factory.CountingDuckFactory;
import Iterator.Flock;
import Observer.Quackologist;

public class DuckTestDrive {
    public static void main(String[] args) {

        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        Quackable readheadDuck = duckFactory.createReadheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        //Quackable gooseDuck = duckFactory.createGoose();
        Quackable gooseDuck = new DuckAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        Flock flockOfMallards = new Flock();

        flockOfDucks.add(readheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");

        flockOfDucks.registerObserver(new Quackologist());

        flockOfDucks.quack();

        System.out.println("\n오리가 소리낸 횟수: " + QuackCounter.getQuacks() + " 번");
    }
}
