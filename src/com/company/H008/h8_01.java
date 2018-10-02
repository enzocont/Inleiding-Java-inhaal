package com.company.H008;

import com.sun.org.glassfish.external.statistics.annotations.Reset;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class h8_01 extends Applet {
    Button knop;
    Label label;
    TextField tekstvak;
    String string;
    String resetst;

    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        add(tekstvak);
        knop = new Button();
        knop.setLabel("Apply");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        string = "";
        knop = new Button();
        knop.setLabel("reset");
        Knop2Listener k2 = new Knop2Listener();
        knop.addActionListener(k2);
        add(knop);
        resetst = "";
    }

    public void paint(Graphics g) {
        g.drawString(string, 50, 100);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string = tekstvak.getText();
            repaint();

        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string = "";
            repaint();
        }
    }
}


