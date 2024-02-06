package com.fouadev.exercice7.presentation;

public class Paiement {
    private double montant;
    private String numeroTransact;

    public Paiement(double montant, String numeroTransact) {
        this.montant = montant;
        this.numeroTransact = numeroTransact;
    }

    public void effectuerPaiement(double montant){
        System.out.print("Le paiement de montant "+montant+" est effuctue avec success, de numero de transaction "+numeroTransact+" ");
    }
}
