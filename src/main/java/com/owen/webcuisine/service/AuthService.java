package com.owen.webcuisine.service;

import com.owen.webcuisine.dao.UserDAO;
import com.owen.webcuisine.model.User;

public class AuthService {
    public User getFromCredential(String email, String password) {
        return new UserDAO().findByCredential(email, password);
    }
}
