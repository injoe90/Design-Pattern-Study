package Factory;

import Duck.Quackable;

public interface AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createReadheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
    //public abstract Quackable createGoose();
}
