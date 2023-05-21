package Command.ConcreteCommands;

import Command.*;

public class AdjustVolumeCommand implements Command {
    private TV tv;
    private int volume;

    public AdjustVolumeCommand(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    @Override
    public void execute() {
        tv.adjustVolume(volume);
    }

    @Override
    public void unexecute() {
        tv.adjustVolume(volume);
    }

}
