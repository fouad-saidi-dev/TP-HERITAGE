package com.fouadev.exercice7.main;

import com.fouadev.exercice7.presentation.CarteCredit;
import com.fouadev.exercice7.presentation.Commande;
import com.fouadev.exercice7.presentation.PayPal;

public class GestionPaiementApp {
    public static void main(String[] args) {
        CarteCredit carteCredit = new CarteCredit(12000,"1234555","7373983939");
        Commande cmd1 = new Commande(12000,carteCredit);
        cmd1.processPayment();

        PayPal payPal = new PayPal(5000,"12345","user@gmail.com");
        Commande cmd2 = new Commande(5000,payPal);
        cmd2.processPayment();

    }
}
