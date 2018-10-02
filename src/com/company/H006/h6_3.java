package com.company.H006;
import java.awt.*;
import java.applet.*;


public class h6_3 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 7;
        b = 8;
        c = 3;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("De uitkomst is: " + uitkomst, 150, 100);
    }
}
