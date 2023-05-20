package Decorator.Decorators;

import Decorator.Beverages.Beverage;

public class Caramel extends AddonDecorator {
    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.25;
    }
}
