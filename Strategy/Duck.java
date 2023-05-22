package Strategy;

import Strategy.DisplayBehaviors.*;
import Strategy.FlyBehaviors.*;
import Strategy.QuackBehaviors.*;

public class Duck {
    private IDisplay displayBehavior;
    private IFly flyBehavior;
    private IQuack quackBehavior;

    public Duck(IDisplay displayBehavior, IFly flyBehavior, IQuack quackBehavior) {
        this.displayBehavior = displayBehavior;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        this.displayBehavior.execute();
    }

    public void fly() {
        this.flyBehavior.execute();
    }

    public void quack() {
        this.quackBehavior.execute();
    }
}
