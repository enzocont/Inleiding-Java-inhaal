package com.company.H011;

import java.awt.*;
import java.applet.*;

public class H011_09 extends Applet {

    public void paint(Graphics g) {
        g.drawLine(49, 49, 290, 49);
        g.drawLine(49, 290,290, 290);
        g.drawLine(49, 49,49, 290);
        g.drawLine(290, 49,290, 290);

        int y = 20;

        for (int rij = 0; rij < 8; rij++) {
            y += 30;
            int x = 50;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (rij == 0 || rij == 2 || rij == 4 || rij == 6) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 30, 30);
                    } else {
                        g.setColor(Color.white);
                        g.fillRect(x, y, 30, 30);
                    }
                }
                else {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.white);
                        g.fillRect(x, y, 30, 30);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 30, 30);
                    }
                }
                x += 30;
            }
        }
    }
}
