package Command;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl remoteControl = new RemoteControl();
        RemoteControlUI remoteControlUI = new RemoteControlUI(remoteControl, tv);
        remoteControlUI.run();
    }
}
