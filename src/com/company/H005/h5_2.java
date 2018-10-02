package com.company.H005;
import java.applet.Applet;
import java.awt.*;

public class h5_2 extends Applet {
    private int valerie;
    private int jeroen;
    private int hans;

    public void init() {
        valerie = 40;
        jeroen = 100;
        hans = 80;
    }

    public void paint(Graphics g) {
        g.drawLine(20, 20, 20, 220);
        g.drawLine(20,220,220, 220);
        g.drawString("0", 0, 220);
        g.drawString("20", 0, 180);
        g.drawString("40", 0, 140);
        g.drawString("60", 0, 100);
        g.drawString("80", 0, 60);
        g.drawString("100", 0, 20);

        g.setColor(Color.magenta);
        g.fillRect(40, 140, 40,80);
        g.setColor(Color.black);
        g.drawString("" + valerie, 40, 240);
        g.setColor(Color.green);
        g.fillRect(100, 20, 40, 200);
        g.setColor(Color.black);
        g.drawString("" + jeroen, 100, 240);
        g.setColor(Color.red);
        g.fillRect(160, 60, 40, 160);
        g.setColor(Color.black);
        g.drawString("" + hans, 165, 240);
    }
}
