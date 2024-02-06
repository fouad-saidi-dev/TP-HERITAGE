package com.fouadev.exercice3.presentation;


public class Voiture extends Vehicule{
    private String modele;
    private String annee;

    public Voiture() {
    }

    public Voiture(String nom,double prix,String modele, String annee) {
        super(nom,prix);
        this.modele = modele;
        this.annee = annee;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
    @Override
    public void emettreSon(){
        System.out.println("La voiture vrombit.");
    }
}

