package Decorator.Decorators;

import Decorator.Beverages.Beverage;

public class Drinkable extends AddonDecorator {
    Beverage beverage;

    public Drinkable(Beverage beverage) {
        this.beverage = beverage;
    }

    public void drink() {
        System.out.println("You drank the " + beverage.getDescription() + ", YUMMY!");
    }

    public String getDescription() {
        return beverage.getDescription();
    }

    public double getCost() {
        return beverage.getCost();
    }
}
