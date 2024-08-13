package com.dhakarlabh.talent_link.repository;

import com.dhakarlabh.talent_link.models.CompanyInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyInfoRepository implements IRepository<CompanyInformation>{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public CompanyInformation save(CompanyInformation companyInformation) {
        return mongoTemplate.save(companyInformation);
    }

    @Override
    public CompanyInformation get(String id) {
        return mongoTemplate.findById(id, CompanyInformation.class);
    }

    @Override
    public List<CompanyInformation> getAll() {
        return mongoTemplate.findAll(CompanyInformation.class);
    }

    @Override
    public void delete(String id) {
         mongoTemplate.remove(id);
    }

    @Override
    public CompanyInformation update(CompanyInformation companyInformation) {
        return mongoTemplate.save(companyInformation);
    }
}
