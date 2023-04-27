package com.owen.webcuisine.service;

import com.owen.webcuisine.dao.RecetteDAO;
import com.owen.webcuisine.model.Recette;

import java.util.List;

public class RecetteService {
    public List<Recette> fetchAll() {
        return new RecetteDAO().findAll();
    }
}
