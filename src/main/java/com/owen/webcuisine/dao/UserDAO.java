package com.owen.webcuisine.dao;

import com.owen.webcuisine.model.DB;
import com.owen.webcuisine.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAO implements GenericDAO<User>{
    @Override
    public User create(User object) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User update(User object) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    public User findByCredential(String email, String password) {
        Connection connection = DB.getConnection();
        User user = null;
        try(PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, nom, prenom, email, image, mot_de_passe FROM user WHERE email LIKE ? AND mot_de_passe LIKE ? ")) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(1, password);

            ResultSet resultSet = preparedStatement.getResultSet();
            if(resultSet.next()) {
                user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("nom"),
                        resultSet.getString("prenom"),
                        resultSet.getString("email"),
                        resultSet.getString("image"),
                        resultSet.getString("mot_de_passe")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
