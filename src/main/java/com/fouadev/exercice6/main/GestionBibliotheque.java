package com.fouadev.exercice6.main;

import com.fouadev.exercice6.presentation.Dvd;
import com.fouadev.exercice6.presentation.Livre;
import com.fouadev.exercice6.presentation.Utilisateur;

public class GestionBibliotheque {
    public static void main(String[] args) {
        Utilisateur utilisateur = new Utilisateur("nom");
        Livre livre = new Livre("livre1","user1");
        Dvd dvd = new Dvd("dvd1","user2");
        utilisateur.emprunterObjet(livre);
        utilisateur.emprunterObjet(dvd);
        livre.retourner();
        dvd.retourner();
    }
}
