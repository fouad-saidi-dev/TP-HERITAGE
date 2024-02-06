package com.fouadev.exercice5.presentation;

public abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract void calculerAire();
    public abstract void calculerPerimetre();
    public void afficherDetails() {
        System.out.println("Le nom"+nom);
        this.calculerPerimetre();
        this.calculerAire();
    }

}
