package Command;

import Command.ConcreteCommands.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoteControlUI extends JFrame {
    private RemoteControl remoteControl;
    private TV tv;

    public RemoteControlUI(RemoteControl remoteControl, TV tv) {
        this.remoteControl = remoteControl;
        this.tv = tv;
    }

    public void run() {
        initUI();
    }

    private void initUI() {
        setTitle("Remote Control");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 400);
        setLayout(new GridLayout(3, 2));
        createButtons();
        setBackground(Color.CYAN);
        setResizable(false);
        pack();
        setVisible(true);
    }

    private void createButtons() {
        RemoteJButton turnOnButton = new RemoteJButton("Turn On");
        turnOnButton.setIcon("icons/TurnOn.png", 10);
        turnOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remoteControl.setCommand(new TurnOnCommand(tv));
                remoteControl.pressButton();
            }
        });

        RemoteJButton turnOffButton = new RemoteJButton("Turn Off");
        turnOffButton.setIcon("icons/TurnOff.png", 15);
        turnOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remoteControl.setCommand(new TurnOffCommand(tv));
                remoteControl.pressButton();
            }
        });

        RemoteJButton increaseVolumeButton = new RemoteJButton("Increase Volume");
        increaseVolumeButton.setIcon("icons/VolumeUp.png", 40);
        increaseVolumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remoteControl.setCommand(new AdjustVolumeCommand(tv, tv.getCurrentVolume() + 1));
                remoteControl.pressButton();
            }
        });

        RemoteJButton decreaseVolumeButton = new RemoteJButton("Decrease Volume");
        decreaseVolumeButton.setIcon("icons/VolumeDown.png", 40);
        decreaseVolumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remoteControl.setCommand(new AdjustVolumeCommand(tv, tv.getCurrentVolume() - 1));
                remoteControl.pressButton();
            }
        });

        RemoteJButton nextChannelButton = new RemoteJButton("Next Channel");
        nextChannelButton.setIcon("icons/ChPlus.png", 40);
        nextChannelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remoteControl.setCommand(new ChangeChannelCommand(tv, tv.getCurrentChannel() + 1));
                remoteControl.pressButton();
            }
        });

        RemoteJButton previousChannelButton = new RemoteJButton("Previous Channel");
        previousChannelButton.setIcon("icons/ChMinus.png", 40);
        previousChannelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remoteControl.setCommand(new ChangeChannelCommand(tv, tv.getCurrentChannel() - 1));
                remoteControl.pressButton();
            }
        });

        Container buttonPane = getContentPane();
        buttonPane.add(turnOnButton);
        buttonPane.add(turnOffButton);
        buttonPane.add(increaseVolumeButton);
        buttonPane.add(decreaseVolumeButton);
        buttonPane.add(nextChannelButton);
        buttonPane.add(previousChannelButton);

    }
}
