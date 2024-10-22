package com.DTOImpl.SpringDTOimpl.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.DTOImpl.SpringDTOimpl.dto.userlocation_dto;
import com.DTOImpl.SpringDTOimpl.model.Users;

@Mapper(componentModel = "spring")
public interface mapper {
    mapper INSTANCE = Mappers.getMapper(mapper.class);

    @Mapping(source = "email", target = "email")
    @Mapping(source = "id",target="id")
    userlocation_dto testdto(Users user);

}
