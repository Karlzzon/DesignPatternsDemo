package Command;

//invoker class
public class RemoteControl {
    private Command command;
    protected Object tv;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
    
}
