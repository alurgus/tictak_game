package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    public static final int WINDOW_XPOS = 800;
    public static final int WINDOW_YPOS = 300;
    public static final int WINDOW_WIDTH = 507;
    public static final int WINDOW_HEIGHT = 555;

    JButton btnStart = new JButton("Start");
    JButton btnExit = new JButton("Exit");

    Map map;
    SettingsWindow settings;

    public GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_XPOS, WINDOW_YPOS);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setTitle("TicTacToe");
        setResizable(false);


        Map map = new Map();

        settings = new SettingsWindow(this);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });


        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStart);
        panBottom.add(btnExit);
        add(map);
        add(panBottom, BorderLayout.SOUTH);


        setVisible(true);
    }
        void startNewGame ( int mode, int fSzX, int fSzY, int wLen){
            map.startNewGame(mode, fSzX, fSzY, wLen);

        }

    }



