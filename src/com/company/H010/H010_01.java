package com.company.H010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H010_01 extends Applet {
    Button knop;
    String uitkomst, uitkomst2, uitkomst3;
    TextField tekstvak1, tekstvak2;
    double a, b;

    public void init() {

        tekstvak1 = new TextField("", 10);
        add(tekstvak1);

        tekstvak2 = new TextField("", 10);
        add(tekstvak2);

        knop = new Button("Bereken");
        knop.addActionListener( new Uitkomst() );
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(""+uitkomst, 50, 60);
        g.drawString(""+uitkomst2, 50, 75);
        g.drawString(""+uitkomst3, 50, 90);
    }

    class Uitkomst implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String input1 = tekstvak1.getText();
            String input2 = tekstvak2.getText();
            a = Integer.parseInt(input1);
            b = Integer.parseInt(input2);
            if (a > b) {
                uitkomst = ""+a+" is groter dan "+b;
                uitkomst2 = "het grootste getal is "+a;
                uitkomst3 = "Het kleinste getal is "+b;
            }
            if (a < b) {
                uitkomst = ""+a+" is kleiner dan "+b;
                uitkomst2 = "het grootste getal is "+b;
                uitkomst3 = "Het kleinste getal is "+a;

            }
            if (a == b) {
                uitkomst = ""+a+" is evenveel als "+b;
                uitkomst2 = "Ze zijn allebij even groot";
                uitkomst3 ="";

            }
            repaint();
        }
    }
}