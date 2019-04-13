package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuFenetre extends JFrame{
    private Container cont;
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
        cont = this.getContentPane();
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        /*Partie APPLICATION*/
        applicationMenu = new JMenu("Application");
        applicationMenu.setMnemonic('A');
        menuBar.add(applicationMenu);
        quitter = new JMenuItem("Quitter");
        quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
        ExitListener exitListener = new ExitListener();
        quitter.addActionListener(exitListener);
        applicationMenu.add(quitter);

        /*Partie ETUDIANT*/
        etudiantMenu = new JMenu("Etudiant");
        etudiantMenu.setMnemonic('E');
        menuBar.add(etudiantMenu);
        inscription = new JMenuItem("Inscription");
        inscription.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
        etudiantMenu.add(inscription);

        /*Partie INFOS*/
        infoMenu = new JMenu("Infos");
        infoMenu.setMnemonic('I');
        menuBar.add(infoMenu);
        iesn = new JMenuItem("IESN");
        iesn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
        iesn.addActionListener(new IESNListener());
        infoMenu.add(iesn);
        aide = new JMenuItem("Aide");
        aide.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
        aide.addActionListener(new AideListener());
        infoMenu.add(aide);

        //Pour arreter le processus quand on appuie sur la croix
        this.addWindowListener(new ClosingListener());
        this.add(new FormulaireInscription());
        setVisible(true);
    }

    public Container getCont(){
        return cont;
    }

    private class ExitListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            System.exit(0);
        }
    }

    private class ClosingListener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }

    private class AideListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            FenetreAide aide = new FenetreAide();
        }
    }

    private class IESNListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            cont.removeAll();
            cont.add(new InfoIesn());
            cont.repaint();

            MenuFenetre.this.setVisible(true);
        }
    }
}
