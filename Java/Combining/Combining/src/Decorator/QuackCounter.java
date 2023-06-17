package Decorator;

import Duck.Quackable;
import Observer.*;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    public void notifyObservers() {
        duck.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    public String toString() {
        return duck.toString();
    }
}
