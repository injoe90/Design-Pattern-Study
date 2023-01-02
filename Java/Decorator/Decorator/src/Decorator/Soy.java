package Decorator;

import Beverage.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        double cost = beverage.cost();

        switch (beverage.getSize()) {
            case TALL -> {
                cost += 0.1;
            }
            case GRANDE -> {
                cost += 0.15;
            }
            case VENTI -> {
                cost += 0.2;
            }
        }

        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
