package com.example.companydetails.repository;

import com.example.companydetails.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

    public void interface1();


    String getCompanyName();
}
