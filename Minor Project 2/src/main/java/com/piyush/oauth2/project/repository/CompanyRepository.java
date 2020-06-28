package com.piyush.oauth2.project.repository;

import com.piyush.oauth2.project.model.Company;

import java.util.List;

public interface CompanyRepository {

    Company find(Long id);

    Company find(String name);

    List<Company> findAll();

    void create(Company company);

    Company update(Company company);

    void delete(Long id);

    void delete(Company company);
}
