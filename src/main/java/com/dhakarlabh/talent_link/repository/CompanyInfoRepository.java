package com.dhakarlabh.talent_link.repository;

import com.dhakarlabh.talent_link.models.CompanyInformation;

import java.util.List;

public class CompanyInfoRepository implements IRepository<CompanyInformation>{

    @Override
    public CompanyInformation save(CompanyInformation entity) {
        return null;
    }

    @Override
    public CompanyInformation get(String id) {
        return null;
    }

    @Override
    public List<CompanyInformation> getAll() {
        return List.of();
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public CompanyInformation update(CompanyInformation entity) {
        return null;
    }
}
