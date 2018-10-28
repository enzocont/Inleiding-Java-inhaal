package com.company.H008;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h8_praktijk extends Applet {
    Button knop;
    String schermtekst;
    TextField tekstvak1, tekstvak2;
    double a, b, uitkomst;

    public void init() {
        tekstvak1 = new TextField("", 10);
        add(tekstvak1);

        tekstvak2 = new TextField("", 10);
        add(tekstvak2);

        knop = new Button("+");
        knop.addActionListener( new plus() );
        add(knop);

        knop = new Button("-");
        knop.addActionListener( new min() );
        add(knop);

        knop = new Button("X");
        knop.addActionListener( new keer() );
        add(knop);

        knop = new Button("/");
        knop.addActionListener( new gedeeld() );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 62, 40 );
    }

    class plus implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String input1 = tekstvak1.getText();
            String input2 = tekstvak2.getText();
            a = Integer.parseInt(input1);
            b = Integer.parseInt(input2);
            uitkomst = a + b;
            schermtekst = "Het antwoord is: " +uitkomst;
            repaint();
        }
    }
    class min implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input1 = tekstvak1.getText();
            String input2 = tekstvak2.getText();
            a = Integer.parseInt(input1);
            b = Integer.parseInt(input2);
            uitkomst = a - b;
            schermtekst = "Het antwoord is: " +uitkomst;
            repaint();
        }
    }
    class keer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input1 = tekstvak1.getText();
            String input2 = tekstvak2.getText();
            a = Integer.parseInt(input1);
            b = Integer.parseInt(input2);
            uitkomst = a * b;
            schermtekst = "Het antwoord is: " +uitkomst;
            repaint();
        }
    }
    class gedeeld implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input1 = tekstvak1.getText();
            String input2 = tekstvak2.getText();
            a = Integer.parseInt(input1);
            b = Integer.parseInt(input2);
            uitkomst = a / b;
            schermtekst = "Het antwoord is: " +uitkomst;
            repaint();
        }
    }
}
