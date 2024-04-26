package com.example.apipostgre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apipostgre.entity.models.UsersEntity;

public interface UserRepository extends JpaRepository<UsersEntity, Integer> {
    
}
