package com.iwan.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iwan.crud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
}

