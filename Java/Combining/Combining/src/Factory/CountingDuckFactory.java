package Factory;

import Adapter.DuckAdapter;
import Decorator.QuackCounter;
import Duck.*;

public class CountingDuckFactory implements AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createReadheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

//    @Override
//    public Quackable createGoose() {
//        return new QuackCounter(new DuckAdapter(new Goose()));
//    }
}
