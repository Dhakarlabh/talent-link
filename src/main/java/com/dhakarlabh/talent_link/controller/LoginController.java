package com.dhakarlabh.talent_link.controller;


import com.dhakarlabh.talent_link.models.Student;
import com.dhakarlabh.talent_link.models.TPR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.dhakarlabh.talent_link.constants.ControllerConstants.*;

@RestController
public class LoginController {

    @Autowired
    StudentController studentController;

    @Autowired
    TPRController tprController;

    @GetMapping(API + STUDENT + LOGIN)
    public String loginStudent(@RequestParam String id, @RequestParam String password) {
        Student studentDetails = studentController.getStudent(id);
        if (studentDetails != null && studentDetails.getPassword().equals(password)) {
            return "Login successful";
        }
        return "Login failed";
    }

    @PostMapping(API + STUDENT + REGISTER  )
    public String registerStudent(@RequestBody Student student) {
        Student studentDetails = studentController.getStudent(student.getId());
        if (studentDetails != null) {
            return "Student already exists";
        }
        studentController.addStudent(student);
        return "Student added";
    }

    @GetMapping(API + TPR + LOGIN)
    public String loginTpr(@RequestParam String id, @RequestParam String password) {
        var tprDetails = tprController.getTPR(id);
        if(tprDetails != null && tprDetails.getPassword().equals(password)) {
            return "Login successful";
        }
        return "Login failed";
    }

    @PostMapping(API + TPR + REGISTER)
    public String registerTpr(@RequestBody TPR tpr) {
        var tprDetails = tprController.getTPR(tpr.getId());
        if (tprDetails != null) {
            return "Tpr info already exists";
        }
        tprController.addTPR(tpr);
        return "Tpr added";
    }

}
