package com.example.apipostgre.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apipostgre.Dtos.UserDto.UserEntityDto;
import com.example.apipostgre.entity.models.UsersEntity;
import com.example.apipostgre.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService _userService;
    @GetMapping
    public ResponseEntity getUsers() {
        var userService  = this._userService.getAllUsers();
        if(userService.isEmpty()) ResponseEntity.noContent();
        return ResponseEntity.ok(userService);
    }
    @PostMapping("create-user")
    public ResponseEntity createUser(@RequestBody UserEntityDto user) {
        var createdUsers= this._userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUsers);
    }
}
