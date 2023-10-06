package com.example.m201_poo_ex4;

public class ProduitAchete extends Produit{
    private int quantite;

    public ProduitAchete(String nom, double prix, int quantite) {
        super(nom, prix);
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    //Redéfinition d'une méthode
    @Override
    public String toString() {
        return "ProduitAchete{" +
                "nom=" + this.getNom() +
                ", prix=" + this.getPrix() +
                ", quantite=" + quantite +
                '}';
    }
}
