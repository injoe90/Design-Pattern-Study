package Duck;

import Observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
