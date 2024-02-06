package com.fouadev.exercice1.prsentation;

public class Compte {
    private String numero;
    private double solde;
    private int nbCompte;

    public Compte(String numero, int nbCompte) {
        this.numero = numero;
        this.solde = 0;
        this.nbCompte = nbCompte;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


}
