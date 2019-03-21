package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MenuFenetre extends JFrame{
    private JMenuBar menuBar;
    private JMenu applicationMenu;
    private JMenu etudiantMenu;
    private JMenu infoMenu;

    private JMenuItem quitter;
    private JMenuItem inscription;
    private JMenuItem iesn;
    private JMenuItem aide;

    public MenuFenetre(){
        super("IESN");
        setBounds(100,100,1000,500);
        setVisible(true);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        applicationMenu = new JMenu("Application");
        applicationMenu.setMnemonic('A');
        menuBar.add(applicationMenu);
        quitter = new JMenuItem("Quitter");
        quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
        ExitListener exitListener = new ExitListener();
        quitter.addActionListener(exitListener);
        applicationMenu.add(quitter);

        etudiantMenu = new JMenu("Etudiant");
        etudiantMenu.setMnemonic('E');
        menuBar.add(etudiantMenu);
        inscription = new JMenuItem("Inscription");
        inscription.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
        etudiantMenu.add(inscription);

        infoMenu = new JMenu("Infos");
        infoMenu.setMnemonic('I');
        menuBar.add(infoMenu);
        iesn = new JMenuItem("IESN");
        iesn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
        infoMenu.add(iesn);
        aide = new JMenuItem("Aide");
        aide.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
        infoMenu.add(aide);


    }

    private class ExitListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.exit(0);
        }
    }
}
