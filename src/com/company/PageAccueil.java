package com.company;

import javax.swing.*;
import java.awt.*;

public class PageAccueil extends JPanel{
    private JLabel label;

    public PageAccueil(){
        this.label = new JLabel("<html><h1>Programme du labo 5 de Java</h1><h2 style='color:blue; text-align:center;'>Testez à votre guise</h2></html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        this.setLayout(new BorderLayout());

        this.add(label,BorderLayout.CENTER);
    }
}
