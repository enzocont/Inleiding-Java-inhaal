package com.company.H005;

import java.applet.Applet;
import java.awt.*;

public class h5_1  extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.red;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //teken rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        //teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);

        g.setColor(Color.black);
        g.drawLine(100,50,breedte, 50);

        g.setColor(opvulkleur);
        g.setColor(Color.black);
        g.drawOval(565, 100, breedte, hoogte);
        g.setColor(Color.green);
        g.fillArc(565, 100, breedte,hoogte, 30, 30);
        g.setColor(Color.BLACK);
        g.drawOval(565, 225, breedte/2, breedte/2);
    }
}