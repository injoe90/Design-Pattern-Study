package Factory;

import Adapter.DuckAdapter;
import Duck.*;

public class DuckFactory implements AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createReadheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

//    @Override
//    public Quackable createGoose() {
//        return new DuckAdapter(new Goose());
//    }
}
