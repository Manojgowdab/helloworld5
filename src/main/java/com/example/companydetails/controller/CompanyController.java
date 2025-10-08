package com.example.companydetails.controller;


import com.example.companydetails.entity.Company;
import com.example.companydetails.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> getCompanyDetails()
    {
        return companyService.getCompanyDetails();
    }

}
