package guiApp.windowParts.areas;

import guiApp.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {

    private JLabel hp;
    private JLabel experience;
    private JLabel coins;

    private InfoPanel infoPanel;

    public PlayerInfoArea(InfoPanel infoPanel) {
        this.infoPanel = infoPanel;

        setLayout(new GridLayout(4,1));

        hp = new JLabel("HP: ?x?");
        experience = new JLabel("Experience: ?");
        coins = new JLabel("Coins: ?");

        add(new JLabel("= Player Info ="), SwingConstants.CENTER);
        add(hp);
        add(experience);
        add(coins);
    }

}
