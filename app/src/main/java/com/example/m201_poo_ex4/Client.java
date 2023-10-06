package com.example.m201_poo_ex4;

import java.util.ArrayList;

public class Client {

    private String cin;

    private ArrayList<ProduitAchete> pannier;

    public Client(String cin) {
        this.cin = cin;
        this.pannier = new ArrayList<ProduitAchete>();
    }

    public void achetter(ProduitAchete pa) {

        pannier.add(pa);
    }

    public double calculerTotal() {

        double total = 0;

        for (ProduitAchete pa : pannier) {
           total=total + pa.getPrix()*pa.getQuantite();
        }

        return total;
    }

}
