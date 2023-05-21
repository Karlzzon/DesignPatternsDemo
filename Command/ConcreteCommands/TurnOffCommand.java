package Command.ConcreteCommands;

import Command.*;

public class TurnOffCommand implements Command {
    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void unexecute() {
        tv.turnOn();
    }

}
