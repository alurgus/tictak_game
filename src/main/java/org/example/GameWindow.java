package org.example;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    public static final int WINDOW_XPOS = 800;
    public static final int WINDOW_YPOS = 300;
    public static final int WINDOW_WIDTH = 507;
    public static final int WINDOW_HEIGHT = 555;

    JButton btnStart = new JButton("Start New Game");
    JButton btnExit = new JButton("Exit");

    public GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_XPOS, WINDOW_YPOS);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setTitle("TicTacToe");
        setResizable(false);

        JPanel panBottom = new JPanel(new GridLayout(1,2));
        panBottom.add(btnStart);
        panBottom.add(btnExit);

        add(panBottom, BorderLayout.SOUTH);


        setVisible(true);


    }
}
