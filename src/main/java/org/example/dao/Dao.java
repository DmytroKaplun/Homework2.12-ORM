package org.example.dao;

import java.util.List;

public interface Dao<T, ID> {
    void save(T entity);
    T findById(ID ID);
    void update(T entity);
    void delete(T entity);
    List<T> findAll();
}
