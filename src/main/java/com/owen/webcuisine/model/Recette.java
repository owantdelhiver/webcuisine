package com.owen.webcuisine.model;

import java.util.Date;

public class Recette {
    private int id;
    private String titre;
    private int temps;
    private String difficulte;
    private String cout;
    private int nombre_personne;
    private String etapes;
    private Categorie categorie;
    private Date derniere_vu;

    public Recette(int id, String titre, int temps, String difficulte, String cout, int nombre_personne, String etapes, Categorie categorie) {
        this.id = id;
        this.titre = titre;
        this.temps = temps;
        this.difficulte = difficulte;
        this.cout = cout;
        this.nombre_personne = nombre_personne;
        this.etapes = etapes;
        this.categorie = categorie;
    }

    public Recette(int id, String titre, int temps, String difficulte, String cout, int nombre_personne, String etapes, Categorie categorie, Date derniere_vu) {
        this.id = id;
        this.titre = titre;
        this.temps = temps;
        this.difficulte = difficulte;
        this.cout = cout;
        this.nombre_personne = nombre_personne;
        this.etapes = etapes;
        this.categorie = categorie;
        this.derniere_vu = derniere_vu;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public int getTemps() {
        return temps;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public String getCout() {
        return cout;
    }

    public int getNombre_personne() {
        return nombre_personne;
    }

    public String getEtapes() {
        return etapes;
    }

    public Categorie getCategorie() {
        return categorie;
    }
}
