package Strategy;

import Strategy.DisplayBehaviors.*;
import Strategy.FlyBehaviors.*;
import Strategy.QuackBehaviors.*;

public class Main {

    public static void main(String[] args) {
        IDisplay noDisplay = new NoDisplay();
        IDisplay sittingDisplay = new SittingDisplay();
        IDisplay standingDisplay = new StandingDisplay();

        IFly noFly = new NoFly();
        IFly fastFly = new FastFly();
        IFly slowFly = new SlowFly();

        IQuack noQuack = new NoQuack();
        IQuack loudQuack = new LoudQuack();
        IQuack quietQuack = new QuietQuack();

        Duck rubberDuck = new Duck(noDisplay, noFly, noQuack);
        System.out.println("Im A RubberDuck!");
        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.quack();
        System.out.println();

        Duck mallardDuck = new Duck(sittingDisplay, fastFly, loudQuack);
        System.out.println("Im A MallardDuck!");
        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.quack();
        System.out.println();

        Duck decoyDuck = new Duck(standingDisplay, slowFly, quietQuack);
        System.out.println("Im A DecoyDuck!");
        decoyDuck.display();
        decoyDuck.fly();
        decoyDuck.quack();
        System.out.println();

    }

}
