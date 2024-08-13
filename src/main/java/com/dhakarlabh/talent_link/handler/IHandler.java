package com.dhakarlabh.talent_link.handler;

import com.dhakarlabh.talent_link.models.Student;

import java.util.List;

public interface IHandler<T> {

    T add(Student student);

    T update(Student student);

    void delete(Student student);

    T get(String id);

    List<T> getAll();

}
