package com.example.m201_poo_ex4;

import android.provider.Settings;

public class Test {

    public static void main(String[] args) {

        Produit pr = new Produit("Samsung A1",3400);

        System.out.println(pr);

        ProduitAchete pa = new ProduitAchete("HP 320",4300,3);

        System.out.println(pa);

        Client c1 = new Client("BJ230");

        c1.achetter(pa);

        ProduitAchete pa2 = new ProduitAchete("Dell 200",5300,5);

        c1.achetter(pa2);

        System.out.println(c1.calculerTotal());




    }
}
