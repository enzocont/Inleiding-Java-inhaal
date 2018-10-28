package com.company.H008;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H08_03 extends Applet {
    Button knop;
    String schermtekst;
    TextField tekstvak;
    double a, b;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Oké");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 62, 40 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String input = tekstvak.getText();
            a = Integer.parseInt(input);
            b = a/100*121;
            schermtekst = "Incl. BTW =" + b;
            repaint();
        }
    }


}
