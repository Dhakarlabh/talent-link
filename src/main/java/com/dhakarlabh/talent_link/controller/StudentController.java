package com.dhakarlabh.talent_link.controller;

import com.dhakarlabh.talent_link.models.Student;
import com.google.common.flogger.FluentLogger;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import static com.dhakarlabh.talent_link.constants.ControllerConstants.API;
import static com.dhakarlabh.talent_link.constants.ControllerConstants.STUDENT;

@RestController
public class StudentController {

    @Autowired
    MongoTemplate mongoTemplate;

    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();

    @GetMapping(API + STUDENT)
    public Student getStudent(@RequestParam String id) {
        return mongoTemplate.findById(id, Student.class);
    }

    @PostMapping(API + STUDENT)
    public Student addStudent(@RequestBody Student student) {
        return mongoTemplate.save(student);
    }

    @DeleteMapping(API + STUDENT)
    public Student deleteStudent(@RequestParam String id) {
        LOGGER.atInfo().log("Get request for company info for company id :",id);
        Query deleteQuery = new Query().addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.findAndRemove(deleteQuery,Student.class);
    }
}
