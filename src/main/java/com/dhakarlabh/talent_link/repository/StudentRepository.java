package com.dhakarlabh.talent_link.repository;

import com.dhakarlabh.talent_link.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentRepository implements IRepository<Student>{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Student save(Student studentInformation) {
        return mongoTemplate.save(studentInformation);
    }

    @Override
    public Student get(String id) {
        return mongoTemplate.findById(id, Student.class);
    }

    @Override
    public List<Student> getAll() {
        return mongoTemplate.findAll(Student.class);
    }

    @Override
    public void delete(String id) {
        mongoTemplate.remove(id);
    }

    @Override
    public Student update(Student studentInformation) {
        return mongoTemplate.save(studentInformation);
    }
}
