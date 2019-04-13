package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreAide extends JFrame{
    private Container container;

    public FenetreAide(){
        super("Aide");
        setBounds(150,150,400,200);
        container = this.getContentPane();

        JPanel panneau = new JPanel();
        panneau.setLayout(new GridLayout(2,1));
        JLabel label = new JLabel("Ceci est une aide");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panneau.add(label);
        JButton boutton = new JButton("Sortir");
        boutton.addActionListener(new BouttonListener());
        panneau.add(boutton);

        this.add(panneau);
        this.setVisible(true);
    }

    private class BouttonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            FenetreAide.this.dispose();
        }
    }
}
