package com.fouadev.exercice4.presentation;

public class Manager extends Employe{
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire,String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service=service;
    }


    @Override
    public void calculerSalaire() {
        System.out.println("Le salaire: "+(this.getSalaire()+this.getSalaire()*((double) 20 /100)));
    }

    @Override
    public void afficherInfo() {
        System.out.println("Les info de l'ingenieur: "+getPrenom()+" ,"+getNom()+" ,"+getEmail()+" ,"+getSalaire()+" ,"+service);
    }
}
