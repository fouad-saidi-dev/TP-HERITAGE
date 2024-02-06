package com.fouadev.exercice5.presentation;

public class Cercle extends Figure{

    private double rayon;

    public Cercle(String nom,double rayon) {
        super(nom);
        this.rayon=rayon;
    }

    @Override
    public void calculerAire() {
        System.out.println("L'aire du cercle: "+Math.PI*Math.pow(rayon,2));
    }

    @Override
    public void calculerPerimetre() {
        System.out.println("Le perimetre du cercle: "+2*Math.PI*Math.pow(rayon,2));
    }
}
