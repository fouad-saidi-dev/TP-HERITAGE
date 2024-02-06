package com.fouadev.exercice3.main;

import com.fouadev.exercice3.presentation.Avion;
import com.fouadev.exercice3.presentation.Moto;
import com.fouadev.exercice3.presentation.Voiture;

public class Program {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("v1", 80000, "modele1", "2015");
        Moto m1 = new Moto("m1", 60000, "marq1", 160);
        Avion av1 = new Avion("av1", 3498378, "comp1", 200);
        System.out.println("-----voiture--------");
        v1.afficherInformations();
        System.out.println("Modele: " + v1.getModele() + " Annee: " + v1.getAnnee());
        v1.emettreSon();
        System.out.println("-----moto--------");
        m1.afficherInformations();
        System.out.println("Marque: " + m1.getMarque() + " puissance: " + m1.getPuissance());
        m1.emettreSon();
        System.out.println("-----avion--------");
        av1.afficherInformations();
        System.out.println("Compagnie: " + av1.getCompagnie() + " vitesse max: " + av1.getVitesseMax());
        av1.emettreSon();
    }

}

