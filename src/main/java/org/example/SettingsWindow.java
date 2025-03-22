package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {

    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 230;

    JButton btnStart = new JButton("New Game Start");

    SettingsWindow(GameWindow gameWindow){
        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        add(btnStart);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWindow.startNewGame(1,3,3,3);
                setVisible(false);
            }
        });

    }
}
