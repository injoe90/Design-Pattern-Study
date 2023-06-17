package Adapter;

import Duck.Goose;
import Duck.Quackable;
import Observer.*;

public class DuckAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public DuckAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }


    @Override
    public void quack() {
        goose.hook();
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
        return goose.toString();
    }
}
