package Duck;

import Observer.*;

public class RedheadDuck implements Quackable{
    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
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
        return "붉은머리오리";
    }
}
