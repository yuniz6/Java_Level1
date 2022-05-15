package guiApp.windowParts.areas;

import guiApp.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class PlayerControlArea extends JPanel {

    private JButton moveUp;
    private JButton moveRight;
    private JButton moveDown;
    private JButton moveLeft;

    private InfoPanel infoPanel;

    public PlayerControlArea(InfoPanel infoPanel) {
        this.infoPanel = infoPanel;

        setLayout(new GridLayout(4, 1));

        moveUp = new JButton("UP: 8");
        moveRight = new JButton("RIGHT: 6");
        moveDown = new JButton("DOWN: 2");
        moveLeft = new JButton("LEFT: 4");

        add(moveUp);
        add(moveRight);
        add(moveDown);
        add(moveLeft);
    }
}
