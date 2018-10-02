package com.company.H006;

import java.applet.Applet;
import java.awt.*;

public class h6_praktijk extends Applet {
    float a;
    float b;
    float c;
    float d;
    float uitkomst;

    public void init() {
        a = 5.9f;
        b = 6.3f;
        c = 6.9f;
        uitkomst = Math.round((a + b + c)* 10/3);
        uitkomst = uitkomst/10;
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Het gemiddelde is = " + uitkomst, 125, 100);
    }
}