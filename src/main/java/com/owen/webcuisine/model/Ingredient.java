package com.owen.webcuisine.model;

public class Ingredient {
    private int id;
    private String libelle;
    private String image;
    private int quantite;

    public Ingredient(int id, String libelle, String image, int quantite) {
        this.id = id;
        this.libelle = libelle;
        this.image = image;
        this.quantite = quantite;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getImage() {
        return image;
    }

    public int getQuantite() {
        return quantite;
    }
}
