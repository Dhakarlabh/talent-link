package com.dhakarlabh.talent_link.repository;

import com.dhakarlabh.talent_link.models.Student;

import java.util.List;

public interface IRepository<T> {
    T save(final T entity);

    T get(final String id);

    List<T> getAll();

    void delete(final String id);

    T update(final T entity);

}
