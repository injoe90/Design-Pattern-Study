package Duck;

import Observer.*;

public class DuckCall implements Quackable{
    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("꽉꽉");
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
        return "오리 호출기";
    }
}
