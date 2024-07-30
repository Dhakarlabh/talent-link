package com.dhakarlabh.talent_link.controller;

import com.dhakarlabh.talent_link.models.CompanyInformation;
import com.google.common.flogger.FluentLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import static com.dhakarlabh.talent_link.constants.ControllerConstants.API;
import static com.dhakarlabh.talent_link.constants.ControllerConstants.COMPANY;

@RestController
public class Controller {

    @Autowired
    MongoTemplate mongoTemplate;

    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();

    @PostMapping(path = API + COMPANY)
    public CompanyInformation addCompanyInformation(@RequestBody(required = true) CompanyInformation companyInformation) {
        LOGGER.atInfo().log("%s",companyInformation);
        return mongoTemplate.save(companyInformation);
    }

    @GetMapping(path = API + COMPANY)
    public CompanyInformation getCompanyInformation(@RequestParam(required = true) String id) {
        LOGGER.atInfo().log("Get request for company info for company id :",id);
        return mongoTemplate.findById(id, CompanyInformation.class);
    }

    @DeleteMapping(path = API + COMPANY)
    public CompanyInformation deleteCompanyInformation(@RequestParam(required = true) String id) {
        LOGGER.atInfo().log("Get request for company info for company id :",id);
        Query deleteQuery = new Query().addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.findAndRemove(deleteQuery, CompanyInformation.class);
    }

}
