package com.dhakarlabh.talent_link.handler;

import com.dhakarlabh.talent_link.models.CompanyInformation;
import com.dhakarlabh.talent_link.models.Student;

import java.util.List;

public class CompanyInformationhandler implements IHandler<CompanyInformation> {
    @Override
    public CompanyInformation add(Student student) {
        return null;
    }

    @Override
    public CompanyInformation update(Student student) {
        return null;
    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public CompanyInformation get(String id) {
        return null;
    }

    @Override
    public List<CompanyInformation> getAll() {
        return List.of();
    }
}
