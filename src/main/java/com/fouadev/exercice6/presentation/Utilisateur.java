package com.fouadev.exercice6.presentation;

import com.fouadev.exercice6.presentation.Empruntable;

public class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public void emprunterObjet(Empruntable objet){
       objet.emprunter();
    }

}
