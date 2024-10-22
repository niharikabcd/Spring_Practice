package com.DTOImpl.SpringDTOimpl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

import com.DTOImpl.SpringDTOimpl.dto.userlocation_dto;
import com.DTOImpl.SpringDTOimpl.repository.userrepo;
@Service
public class user_service {
    @Autowired
    private userrepo userrepo;

    @Autowired
    private mapper mapper;

    public List<userlocation_dto> getAllUsersLocation(){
        return userrepo.findAll()
                        .stream()
                        .map(mapper::testdto)
                        .collect(Collectors.toList());
        
    }
    //Mapstruct replaces the below manual conversion of entity to Dto

    /*private userlocation_dto convertEntityToDto(Users user){
        userlocation_dto userlocation_dto = new userlocation_dto();
        userlocation_dto.setId(user.getId());
        userlocation_dto.setEmail(user.getEmail());
        userlocation_dto.setPlace(user.getLocation().getPlace());
        userlocation_dto.setLongitude(user.getLocation().getLongitude());
        userlocation_dto.setLatitude(user.getLocation().getLatitude());
        return userlocation_dto;
    }*/

}

