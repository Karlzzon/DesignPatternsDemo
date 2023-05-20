package Decorator;

import Decorator.Beverages.*;
import Decorator.Decorators.*;

public class main {
    public static void main(String[] args) {
        Beverage beverage = new Latte();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        Beverage beverage2 = new Decaf();
        System.out.println(beverage2.getDescription() + " $" + beverage2.getCost());

        AddonDecorator Caramel = new Caramel(beverage);
        System.out.println(Caramel.getDescription() + " $" + Caramel.getCost());

        AddonDecorator WhippedCream = new WhippedCream(Caramel);
        System.out.println(WhippedCream.getDescription() + " $" + WhippedCream.getCost());

        Drinkable Drinkable = new Drinkable(WhippedCream);
        Drinkable.drink(); // We now added the functionality to drink a beverage through a decorator

    }
}
