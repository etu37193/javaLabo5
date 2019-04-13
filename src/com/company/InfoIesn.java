package com.company;

import javax.swing.*;
import java.awt.*;

public class InfoIesn extends JPanel {

    public InfoIesn() {
        JLabel label = new JLabel("<html><h1>Bienvenue à l'I.E.S.N</br>"
                + "<p>"
                + "l'implentation se situe "
                + "Rue Joseph Calozet 19, 5000 namur<br/>"
                + "<b>Telephone :</b> <em>081/446.85.00</em><br/>"
                + "<b>site web :</b> <a href=\"http://www.henallux.be\">"
                + "<em>henallux.be</em></a></p></html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.setLayout(new BorderLayout());
        this.add(label, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
