package org.example.service;

import org.example.dao.Dao;

import java.util.List;

public class SpaceTravelService<T, ID> {
    private final Dao<T, ID> dao;

    public SpaceTravelService(Dao<T, ID> dao) {
        this.dao = dao;
    }

    public void save(T entity) {
        dao.save(entity);
    }

    public T findById(ID id) {
        return dao.findById(id);
    }

    public void update(T entity) {
        dao.update(entity);
    }

    public void delete(T entity) {
        dao.delete(entity);
    }

    public List<T> findAll() {
        return dao.findAll();
    }
}
