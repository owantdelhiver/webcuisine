package com.owen.webcuisine.dao;

import com.owen.webcuisine.model.Categorie;
import com.owen.webcuisine.model.DB;
import com.owen.webcuisine.model.Ingredient;
import com.owen.webcuisine.model.Recette;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecetteDAO implements GenericDAO<Recette> {
    @Override
    public Recette create(Recette object) {
        return null;
    }

    @Override
    public List<Recette> findAll() {
        List<Recette> recettes = new ArrayList<>();
        List<Ingredient> ingredients;

        Connection connection = DB.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("SELECT recette.id, titre, temps, difficulte, cout, nombre_personne, etapes, categorie.id, categorie.libelle\n" +
                "FROM recette\n" +
                "LEFT JOIN categorie ON categorie.id = recette.id_categorie;")) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                try(PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT id, libelle, image, ri.quantite FROM ingredient INNER JOIN recette_ingredient ri on ingredient.id = ri.id_ingredient WHERE ri.id_recette = ? ")) {
                    preparedStatement1.setInt(1, resultSet.getInt("recette.id"));
                    ResultSet resultSet1 = preparedStatement1.executeQuery();

                    ingredients = new ArrayList<>();
                    while (resultSet1.next()) {
                        ingredients.add(new Ingredient(
                                resultSet1.getInt("id"),
                                resultSet1.getString("libelle"),
                                resultSet1.getString("image"),
                                resultSet1.getInt("ri.quantite")
                        ));
                    }

                }

                recettes.add(new Recette(
                        resultSet.getInt("recette.id"),
                        resultSet.getString("titre"),
                        resultSet.getInt("temps"),
                        resultSet.getString("difficulte"),
                        resultSet.getString("cout"),
                        resultSet.getInt("nombre_personne"),
                        resultSet.getString("etapes"),
                        new Categorie(
                                resultSet.getInt("categorie.id"),
                                resultSet.getString("libelle")
                        ),
                        ingredients
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return recettes;
    }

    @Override
    public Recette findById(Long id) {
        return null;
    }

    @Override
    public Recette update(Recette object) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}