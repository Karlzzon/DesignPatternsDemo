package Strategy.FlyBehaviors;

public class NoFly implements IFly {
    public void execute() {
        System.out.println("I can't fly!");
    }

}
