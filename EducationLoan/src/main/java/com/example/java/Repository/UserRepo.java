package com.example.java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java.Model.UserModel;
@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
