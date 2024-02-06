package com.fouadev.exercice6.presentation;

import com.fouadev.exercice6.presentation.Empruntable;

public class Livre implements Empruntable {

    protected String titre;
    protected String auteur;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public void emprunter() {
        System.out.println("Emprunte le livre de titre:"+titre+" et de autheur: "+auteur);
    }

    @Override
    public void retourner() {
        System.out.println("retourner le Livre "+titre);
    }
}
