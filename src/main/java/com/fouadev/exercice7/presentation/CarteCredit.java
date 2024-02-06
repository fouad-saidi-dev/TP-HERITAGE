package com.fouadev.exercice7.presentation;

public class CarteCredit extends Paiement{

    private String numeroCarte;
    public CarteCredit(double montant, String numeroTransact,String numeroCarte) {
        super(montant, numeroTransact);
        this.numeroCarte = numeroCarte;
    }
    @Override
    public void effectuerPaiement(double montant) {
        super.effectuerPaiement(montant);
        System.out.println("de numero de carte "+numeroCarte);
    }
}
