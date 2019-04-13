package com.company;

import javax.swing.*;
import java.awt.*;

public class FormulaireInscription extends JPanel{
    private JPanel panneauFormulaire;
    private JPanel panneauBoutons;
    private JLabel matriculeLabel, nomLabel, prenomLabel, dateLabel, sectionLabel, comboxLabel;
    private JTextField matricule, nom, prenom, date, section;
    private JCheckBox boursier, etranger;
    private JComboBox comboBox;
    String[] valeurs = {"Europe", "Afrique", "Asie", "Amérique", "Océanie"};

    public FormulaireInscription(){
        this.setLayout(new BorderLayout());

        panneauFormulaire = new JPanel();
        panneauFormulaire.setLayout(new GridLayout(7,2,10,10));

        matriculeLabel = new JLabel("Matricule :");
        matriculeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        matricule = new JTextField();
        panneauFormulaire.add(matriculeLabel);
        panneauFormulaire.add(matricule);

        nomLabel = new JLabel("Nom :");
        nomLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        nom = new JTextField();
        panneauFormulaire.add(nomLabel);
        panneauFormulaire.add(nom);

        prenomLabel = new JLabel("Prénom :");
        prenomLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        prenom = new JTextField();
        panneauFormulaire.add(prenomLabel);
        panneauFormulaire.add(prenom);

        dateLabel = new JLabel("Date :");
        dateLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        date = new JTextField();
        panneauFormulaire.add(dateLabel);
        panneauFormulaire.add(date);

        sectionLabel = new JLabel("Section :");
        sectionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        section = new JTextField();
        panneauFormulaire.add(sectionLabel);
        panneauFormulaire.add(section);

        etranger = new JCheckBox("Étranger");
        boursier = new JCheckBox("Boursier");
        panneauFormulaire.add(etranger);
        panneauFormulaire.add(boursier);

        comboxLabel = new JLabel("Origine :");
        comboxLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        panneauFormulaire.add(comboxLabel);
        comboBox = new JComboBox(valeurs);
        comboBox.setSelectedItem("Europe");
        comboBox.setMaximumRowCount(3);
        panneauFormulaire.add(comboBox);

        panneauBoutons = new JPanel();

        this.add(panneauFormulaire, BorderLayout.CENTER);
    }
}
