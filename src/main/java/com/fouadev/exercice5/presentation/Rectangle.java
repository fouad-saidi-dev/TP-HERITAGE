package com.fouadev.exercice5.presentation;

public class Rectangle extends Figure{

    private double longueur;
    private double largeur;

    public Rectangle(String nom,double longueur,double largeur) {
        super(nom);
        this.longueur=longueur;
        this.largeur=largeur;
    }

    @Override
    public void calculerAire() {
        System.out.println("L'aire du rectangle: "+longueur*largeur);
    }

    @Override
    public void calculerPerimetre() {
        System.out.println("Le perimetre du rectangle: "+2*(longueur+largeur));
    }
}
