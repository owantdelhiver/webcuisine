package com.owen.webcuisine.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO <T>{
    T create(T object);
    List<T> findAll();
    T findById(Long id);
    T update(T object) throws SQLException;
    boolean delete(int id);
}
