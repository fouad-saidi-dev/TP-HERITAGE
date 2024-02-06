package com.fouadev.exercice7.presentation;

public class PayPal extends Paiement{
    private String email;
    public PayPal(double montant, String numeroTransact,String email) {
        super(montant, numeroTransact);
        this.email=email;
    }

    @Override
    public void effectuerPaiement(double montant) {
        super.effectuerPaiement(montant);
        System.out.println("de email "+email);
    }
}
