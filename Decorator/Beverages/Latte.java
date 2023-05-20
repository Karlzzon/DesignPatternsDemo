package Decorator.Beverages;

public class Latte extends Beverage {
    public Latte() {
        description = "Latte";
        cost = 1.99;
    }

    public double getCost() {
        return cost;
    }
}
