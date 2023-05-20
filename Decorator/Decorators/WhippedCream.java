package Decorator.Decorators;

import Decorator.Beverages.Beverage;

public class WhippedCream extends AddonDecorator {
    Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    public double getCost() {
        return beverage.getCost() + 0.20;
    }
}
