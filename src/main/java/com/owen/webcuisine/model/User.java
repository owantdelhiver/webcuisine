package com.owen.webcuisine.model;

public class User {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String image;
    private String mot_de_passe;

    public User(int id, String nom, String prenom, String email, String image, String mot_de_passe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.image = image;
        this.mot_de_passe = mot_de_passe;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getImage() {
        return image;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }
}