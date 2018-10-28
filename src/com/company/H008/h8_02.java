package com.company.H008;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h8_02 extends Applet {
    int man;
    int vrouw;
    int lman;
    int lvrouw;
    int totaal;
    Button knop;
    String schermtekst;

    public void init() {
        setSize(280, 300);
        man = 0;
        vrouw = 0;
        lman = 0;
        lvrouw = 0;
        totaal = 0;

        knop = new Button("Man1");
        knop.addActionListener( new man() );
        add(knop);

        knop = new Button("Vrouw1");
        knop.addActionListener( new vrouw() );
        add(knop);

        knop = new Button("Man2");
        knop.addActionListener( new lman() );
        add(knop);

        knop = new Button("Vrouw2");
        knop.addActionListener( new lvrouw() );
        add(knop);

    }

    public void paint(Graphics g) {
        totaal++;
        g.drawString(""+man, 10, 40 );
        g.drawString(""+vrouw, 52, 40 );
        g.drawString(""+lman, 105, 40 );
        g.drawString(""+lvrouw, 185, 40 );
        g.drawString("In totaal zijn er: " +totaal, 90, 70);
    }

    class man implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man++;
            repaint();
        }
    }
    class vrouw implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            vrouw++;
            repaint();
        }
    }
    class lman implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            lman++;
            repaint();
        }
    }
    class lvrouw implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            lvrouw++;
            repaint();
        }
    }
}
