package com.dhakarlabh.talent_link.controller;

import com.dhakarlabh.talent_link.models.TPR;
import com.google.common.flogger.FluentLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import static com.dhakarlabh.talent_link.constants.ControllerConstants.API;
import static com.dhakarlabh.talent_link.constants.ControllerConstants.STUDENT;

@RestController
public class TPRController {
    @Autowired

    MongoTemplate mongoTemplate;

    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();

    @GetMapping(API + STUDENT)
    public TPR getTPR(@RequestParam String id) {
        return mongoTemplate.findById(id, TPR.class);
    }

    @PostMapping(API + STUDENT)
    public TPR addTPR(@RequestBody TPR tpr) {
        return mongoTemplate.save(tpr);
    }

    @DeleteMapping(API + STUDENT)
    public TPR deleteTPR(@RequestParam String id) {
        LOGGER.atInfo().log("Get request for company info for company id :",id);
        Query deleteQuery = new Query().addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.findAndRemove(deleteQuery,TPR.class);
    }
}
