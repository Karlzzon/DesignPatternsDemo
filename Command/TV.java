package Command;

//Receiver class
public class TV {
    private int channel;
    private int volume;
    private boolean On;

    public TV() {
        On = false;
        channel = 1;
        volume = 50;
    }

    public void turnOn() {
        if (!On) {
            On = true;
            System.out.println("TV is on");
        } else {
            System.out.println("TV is already on");
        }

    }

    public void turnOff() {
        if (On) {
            On = false;
            System.out.println("TV is off");
        } else {
            System.out.println("TV is already off");
        }
    }

    public void changeChannel(int channel) {
        if (On) {
            this.channel = channel;
            System.out.println("TV: channel " + channel + " is set");
        } else {
            System.out.println("Cannot change volume when TV is off");
        }
    }

    public void adjustVolume(int volume) {
        if (On) {
            this.volume = volume;
            System.out.println("TV: volume " + volume + " is set");
        } else {
            System.out.println("Cannot change volume when TV is off");
        }
    }

    public int getCurrentChannel() {
        if (On) {
            return channel;
        } else {
            return 0;
        }
    }

    public int getCurrentVolume() {
        if (On) {
            return volume;
        } else {
            return 0;
        }
    }

}
