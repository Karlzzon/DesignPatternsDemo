package Command;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class RemoteJButton extends JButton {
    private static final Color BUTTON_COLOR = Color.CYAN;
    private static final int BUTTON_WIDTH = 100;
    private static final int BUTTON_HEIGHT = 100;

    public RemoteJButton(String text) {
        super(text);
        setButtonProperties();
        setBackground(new Color(119, 221, 119));
    }

    private void setButtonProperties() {
        setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        setFocusable(false);
        setBackground(BUTTON_COLOR);
    }

    protected void setIcon(String imagePath, int offset) {
        try {
            Image image = ImageIO.read(getClass().getResource(imagePath));
            Image scaledImage = image.getScaledInstance(BUTTON_WIDTH - offset, BUTTON_HEIGHT - offset,
                    Image.SCALE_SMOOTH);
            setIcon(new ImageIcon(scaledImage));
            setText(null);
        } catch (IOException e) {
            System.out.println("Error loading image");
        }
    }
}
