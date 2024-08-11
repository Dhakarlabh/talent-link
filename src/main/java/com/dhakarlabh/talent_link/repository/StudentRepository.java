package com.dhakarlabh.talent_link.repository;

import com.dhakarlabh.talent_link.models.Student;

import java.util.List;

public class StudentRepository implements IRepository<Student>{


    @Override
    public Student save(Student entity) {
        return new Student();
    }

    @Override
    public Student get(String id) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return List.of();
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Student update(Student entity) {
        return null;
    }
}
