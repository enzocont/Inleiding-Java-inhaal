package com.company.H012;

import java.awt.*;
import java.applet.*;

public class H012_02 extends Applet  {

    public void init() {
        Button[] knop = new Button[25];

        for (int teller = 1; teller <= knop.length; teller++) {
            knop[1] = new Button ("" + teller);
            add(knop[1]);
        }
    }
}