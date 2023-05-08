package com.example.java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java.Model.LoanApplicationModel;
@Repository
public interface LoanAppRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
