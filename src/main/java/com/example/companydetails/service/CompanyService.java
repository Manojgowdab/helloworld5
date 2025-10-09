package com.example.companydetails.service;

import com.example.companydetails.entity.Company;
import com.example.companydetails.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getCompanyDetails()
    {
        return companyRepository.findAll();
    }

    public String getNameById(Long companyId)
    {
        return companyRepository.getCompanyName();
    }

}