package com.DTOImpl.SpringDTOimpl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.DTOImpl.SpringDTOimpl.dto.userlocation_dto;
import com.DTOImpl.SpringDTOimpl.service.user_service;

@RestController
public class usercontroller {

    @Autowired
    private user_service user_service;

    @GetMapping("/users-location")
    public List<userlocation_dto> getAllUsersLocation(){
        return user_service.getAllUsersLocation();

    }
}
