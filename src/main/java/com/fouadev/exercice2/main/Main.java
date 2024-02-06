package com.fouadev.exercice2.main;

import com.fouadev.exercice2.presentation.Adherent;
import com.fouadev.exercice2.presentation.Auteur;
import com.fouadev.exercice2.presentation.Livre;

public class Main {
    public static void main(String[] args) {

        Adherent ad1 = new Adherent("pn2","pm2","pm2@gmail.com","009242525",23,1);
        Auteur auteur = new Auteur("aut1","aut1","aut@gmail.com","009242525",23,1);
        Livre livre = new Livre(123,"titre",auteur);
        System.out.println(ad1);
        System.out.println(livre);
    }
}

