package com.dhakarlabh.talent_link.repository;

import com.dhakarlabh.talent_link.models.TPR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TPRRepository implements IRepository<TPR> {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public TPR save(TPR tprInformation) {
        return  mongoTemplate.save(tprInformation);
    }

    @Override
    public TPR get(String id) {
        return mongoTemplate.findById(id, TPR.class);
    }

    @Override
    public List<TPR> getAll() {
        return mongoTemplate.findAll(TPR.class);
    }

    @Override
    public void delete(String id) {
        mongoTemplate.remove(id);
    }

    @Override
    public TPR update(TPR tprInformation) {
        return mongoTemplate.save(tprInformation);
    }
}
