package com.company;

public class Perimetre {

    public static int calPerimetre(int a, int b, int c) {

        int d = Addition.add(a,b);
        int peri = Produit.mult(d,c);
        System.out.println(peri);
        return peri;
    }


}
