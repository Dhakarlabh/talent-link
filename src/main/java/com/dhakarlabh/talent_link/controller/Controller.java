package com.dhakarlabh.talent_link.controller;

import com.dhakarlabh.talent_link.models.CompanyInformation;
import com.dhakarlabh.talent_link.models.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.dhakarlabh.talent_link.constants.ControllerConstants.API;
import static com.dhakarlabh.talent_link.constants.ControllerConstants.COMPANY;

@RestController
public class Controller {

    @PostMapping(path = API + COMPANY)
    public CompanyInformation addCompanyInformation(CompanyInformation companyInformation) {

        return companyInformation;
    }

}
