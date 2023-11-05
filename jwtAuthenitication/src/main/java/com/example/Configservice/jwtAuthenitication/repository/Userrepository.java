package com.example.Configservice.jwtAuthenitication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Configservice.jwtAuthenitication.entity.User;

public interface Userrepository extends JpaRepository<User, Long> {

}
