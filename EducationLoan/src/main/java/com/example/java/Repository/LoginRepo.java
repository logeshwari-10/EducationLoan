package com.example.java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java.Model.LoginModel;
@Repository
public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
