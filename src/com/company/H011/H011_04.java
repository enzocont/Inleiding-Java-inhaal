package com.company.H011;

import java.awt.*;
import java.applet.*;


public class H011_04 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller, uitkomst;
        int y = 15;

        for(teller = 1; teller <= 10; teller++) {
            uitkomst = teller * 3;
            y += 20;
            g.drawString(teller + " x 3" + " = " + uitkomst, 50, y );
        }
    }
}