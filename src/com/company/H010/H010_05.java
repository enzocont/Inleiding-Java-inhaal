package com.company.H010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H010_05 extends Applet {
    TextField tekstvak0, tekstvak1, tekstvak2, tekstvak3;
    String gemid;
    Button knop;
    double a, b, c, d, e, antwoord;
    Color kleur;

    public void init() {
        gemid = "";
        e=4;

        tekstvak0 = new TextField("", 5);
        add(tekstvak0);

        tekstvak1 = new TextField("", 5);
        add(tekstvak1);

        tekstvak2 = new TextField("", 5);
        add(tekstvak2);

        tekstvak3 = new TextField("", 5);
        add(tekstvak3);

        knop = new Button("Bereken");
        knop.addActionListener(new Uitkomst());
        add(knop);
    }

    public void paint(Graphics g) {
        g.setColor(kleur);
        g.drawString(""+gemid, 50, 60);
    }

    class Uitkomst implements ActionListener {
        public void actionPerformed(ActionEvent ex) {
            if (tekstvak0.getText() == "") {
                a = 0;
                e--;
            } else {
                String input0 = tekstvak0.getText();
                a = Integer.parseInt(input0);
            }
            if (tekstvak1.getText() == "") {
                b = 0;
                e--;
            }else {
                String input1 = tekstvak1.getText();
                b = Integer.parseInt(input1);
            }
            if (tekstvak2.getText() == "") {
                c = 0;
                e--;
            } else {
                String input2 = tekstvak2.getText();
                c = Integer.parseInt(input2);
            }
            if (tekstvak3.getText() == "") {
                d = 0;
                e--;
            } else {
                String input3 = tekstvak3.getText();
                d = Integer.parseInt(input3);
            }
            antwoord = (a+b+c+d)/e;
            gemid = "Het gemiddelde is "+antwoord;
            if (antwoord <= 5.5) {
                kleur = Color.RED;
            } else {
                kleur = Color.GREEN;
            }
            repaint();
        }
    }
}