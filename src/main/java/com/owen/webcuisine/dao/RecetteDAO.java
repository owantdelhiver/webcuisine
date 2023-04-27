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
        try(PreparedStatement preparedStatement = connection.prepareStatement("SELECT recette.id, titre,description,image, temps, difficulte, cout, nombre_personne, etapes, categorie.id, categorie.libelle\n" +
                "FROM recette\n" +
                "LEFT JOIN categorie ON categorie.id = recette.id_categorie;")) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                ingredients = new IngredientDAO().findByRecetteId(resultSet.getInt("recette.id"));

                recettes.add(new Recette(
                        resultSet.getInt("recette.id"),
                        resultSet.getString("titre"),
                        resultSet.getString("description"),
                        resultSet.getString("image"),
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
