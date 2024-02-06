package com.fouadev.exercice6.presentation;

public class Dvd implements Empruntable{
    private String titre;
    private String realisateur;

    public Dvd(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
    }


    @Override
    public void emprunter() {
        System.out.println("Emprunte le DVD : "+titre+" de realisateur: "+realisateur);
    }

    @Override
    public void retourner() {
        System.out.println("retourner le DVD "+titre);
    }
}
