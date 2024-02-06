package com.fouadev.exercice3.presentation;

public class Moto extends Vehicule{
    private String marque;
    private int puissance;

    public Moto() {

    }
    public Moto(String nom,double prix,String marque,int puissance) {
        super(nom,prix);
        this.marque=marque;
        this.puissance=puissance;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public void emettreSon(){
        System.out.println("La moto rugit.");
    }
}

