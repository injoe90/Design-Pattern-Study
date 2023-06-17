package Duck;

import Observer.*;

public class RubberDuck implements Quackable{
    Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("삑삑");
        notifyObservers();
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public String toString() {
        return "고무 오리";
    }
}
