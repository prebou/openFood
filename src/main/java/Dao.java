package dao;

import java.util.List;

public interface Dao<T> {
    void create(T obj);
    T findById(int id);
    List<T> findAll();
    void update(T obj);
    void delete(T obj);
}