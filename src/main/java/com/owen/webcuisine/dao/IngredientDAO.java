package com.owen.webcuisine.dao;

import com.owen.webcuisine.model.DB;
import com.owen.webcuisine.model.Ingredient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IngredientDAO implements GenericDAO<Ingredient> {
    @Override
    public Ingredient create(Ingredient object) {
        return null;
    }

    @Override
    public List<Ingredient> findAll() {
        return null;
    }

    @Override
    public Ingredient findById(Long id) {
        return null;
    }

    @Override
    public Ingredient update(Ingredient object) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    public List<Ingredient> findByRecetteId(int id) {
        List<Ingredient> ingredients = new ArrayList<>();
        Connection connection = DB.getConnection();
        try(PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT id, libelle, image, ri.quantite FROM ingredient INNER JOIN recette_ingredient ri on ingredient.id = ri.id_ingredient WHERE ri.id_recette = ? ")) {
            preparedStatement1.setInt(1, id);
            ResultSet resultSet1 = preparedStatement1.executeQuery();

            while (resultSet1.next()) {
                ingredients.add(new Ingredient(
                        resultSet1.getInt("id"),
                        resultSet1.getString("libelle"),
                        resultSet1.getString("image"),
                        resultSet1.getInt("ri.quantite")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return ingredients;
    }
}
