package com.example.apipostgre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apipostgre.Dtos.UserDto.UserEntityDto;
import com.example.apipostgre.entity.models.UsersEntity;
import com.example.apipostgre.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository _repository;


    public List<UsersEntity>  getAllUsers() {
        return this._repository.findAll();
    }

    public UsersEntity createUser(UserEntityDto userDto) {
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setName(userDto.getName());
        usersEntity.setSurname(userDto.getSurname());
        usersEntity.setEmail(userDto.getEmail());
        usersEntity.setPassword(userDto.getPassword());
        
        UsersEntity createNewUser = this._repository.save(usersEntity);
        return createNewUser;
    }
}
