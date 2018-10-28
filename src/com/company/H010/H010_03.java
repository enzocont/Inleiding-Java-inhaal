package com.company.H010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H010_03 extends Applet {
    TextField tekstvak, tekstvak1;
    String dagen, maand, schrik;
    Button knop;
    int a, jaartal;

    public void init() {
        maand ="";
        dagen ="";
        schrik="";

        tekstvak = new TextField("", 10);
        add(tekstvak);

        tekstvak1 = new TextField("", 10);
        add(tekstvak1);

        knop = new Button("Bereken");
        knop.addActionListener(new Uitkomst());
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(""+maand, 50, 60);
        g.drawString(""+dagen, 50, 75);
        g.drawString(""+schrik, 50, 90);
    }

    class Uitkomst implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input1 = tekstvak.getText();
            a = Integer.parseInt(input1);
            String input2 = tekstvak1.getText();
            jaartal = Integer.parseInt(input2);
            boolean schrikkel = (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0;
            if (schrikkel) {
                schrik = "in "+jaartal+ " is het een schrikkeljaar";
            } else {
                schrik = "in "+jaartal+ " is het geen schrikkeljaar";
            }
            if (a == 1) {
                maand = "januari";
                dagen = "31 dagen.";
            }
            else if (a == 2) {
                maand = "februari";
                if (schrikkel == true) {
                    dagen = "29 dagen.";
                } else {
                    dagen = "28 dagen.";
                }
            }
            else if (a == 3) {
                maand = "maart";
                dagen = "31 dagen.";
            }
            else if (a == 4) {
                maand = "april";
                dagen = "30 dagen.";
            }
            else if (a == 5) {
                maand = "mei";
                dagen = "31 dagen.";
            }
            else if (a == 6) {
                maand = "juni";
                dagen = "30 dagen.";
            }
            else if (a == 7) {
                maand = "juli";
                dagen = "31 dagen.";
            }
            else if (a == 8) {
                maand = "augustus";
                dagen = "31 dagen.";
            }
            else if (a == 9) {
                maand = "september";
                dagen = "30 dagen.";
            }
            else if (a == 10) {
                maand = "oktober";
                dagen = "31 dagen.";
            }
            else if (a == 11) {
                maand = "november";
                dagen = "30 dagen.";
            }
            else if (a == 12) {
                maand = "december";
                dagen = "31 dagen.";
            }
            else {
                maand = "Deze variabelen bestaan niet";
                dagen = "28 tot 31 dagen";
            }
            repaint();
        }
    }
}
