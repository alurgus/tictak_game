package org.example;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    Map() {
        setBackground(Color.BLACK);
    }

        void startNewGame ( int mode, int fSzX, int fSzY, int wLen){
            System.out.printf("Mode: %d; \nSize x = %d; \nSize y = %d; \nWin length = %d",
                    mode, fSzX, fSzY, wLen);
        }

}
