package com.company.H011;

import java.awt.*;
import java.applet.*;


public class H011_02 extends Applet {

        public void init() {}

        public void paint(Graphics g) {
            int teller;
            int x = 0;

            for(teller = 20; teller >= 10; teller--) {
                x += 20;
                g.drawString("" + teller, x, 15 );
            }
        }
    }