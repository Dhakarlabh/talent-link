package com.dhakarlabh.talent_link.controller;

import com.dhakarlabh.talent_link.models.Student;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public Student getStudent(){
        return new Student();
    }

}
