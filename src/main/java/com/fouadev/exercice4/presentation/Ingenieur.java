package com.fouadev.exercice4.presentation;

public class Ingenieur extends Employe{


    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire,String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite=specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }


    @Override
    public void calculerSalaire() {
        System.out.println("Le salaire: "+(this.getSalaire()+this.getSalaire()*((double) 15 /100)));
    }

    @Override
    public void afficherInfo() {
        System.out.println("Les info de l'ingenieur: "+getPrenom()+" ,"+getNom()+" ,"+getEmail()+" ,"+getSalaire()+" ,"+specialite);
    }

}
