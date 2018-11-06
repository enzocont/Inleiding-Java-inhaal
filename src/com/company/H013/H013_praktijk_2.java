package com.company.H013;

import java.applet.*;
import java.awt.*;

public class H013_praktijk_2 extends Applet {

    public void init(){
        setSize(1018, 300);
    }

    public void paint(Graphics g) {
        for(int Kolom = 0; Kolom < 5; Kolom++) {
            for(int Rij = 0; Rij < 2; Rij++) {
                tekenBoom(g, 50 + Kolom * 200 + 100 * (Rij%2), (Rij+5) * 40 - 100, 20, 90);
            }
        }
    }

    private void tekenBoom(Graphics g, int x1, int y1, int x2, int y2) {
        g.setColor(Color.pink);
        g.fillRect(x1, y1, x2, y2);
        g.setColor(Color.green);
        g.fillOval(x1-35, y1-50, x2+70, y2);
    }
}