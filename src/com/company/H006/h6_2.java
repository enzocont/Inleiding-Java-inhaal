package com.company.H006;
import java.applet.Applet;
import java.awt.*;


public class h6_2 extends Applet {
    private int minuten;
    private int uren;
    private int dagen;
    private int jaar;


    public void init() {
        int seconden = 1;
        minuten = seconden * 60;
        uren = minuten * 60;
        dagen = uren * 24;
        jaar = dagen * 365;
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Aantal seconden in 1 minuut: " + minuten, 60, 80);
        g.drawString("Aantal seconden in 1 uur: " + uren, 60, 100);
        g.drawString("Aantal seconden in 1 dag: " + dagen, 60, 120);
        g.drawString("Aantal seconden in 1 jaar: " + jaar, 60, 140);

    }
}