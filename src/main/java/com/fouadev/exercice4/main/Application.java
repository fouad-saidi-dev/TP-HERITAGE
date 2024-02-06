package com.fouadev.exercice4.main;

import com.fouadev.exercice4.presentation.Employe;
import com.fouadev.exercice4.presentation.Ingenieur;
import com.fouadev.exercice4.presentation.Manager;

public class Application {
    public static void main(String[] args) {
        Employe e1 = new Ingenieur("n1","p1","em1","0000000",10000,"sp");
        e1.calculerSalaire();
        e1.afficherInfo();
        Employe m1 = new Manager("m1","m1","em2","9849874",20000,"IT");
        m1.calculerSalaire();
    }
}
