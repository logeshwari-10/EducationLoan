package com.example.java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java.Model.AdminModel;
@Repository
public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}
